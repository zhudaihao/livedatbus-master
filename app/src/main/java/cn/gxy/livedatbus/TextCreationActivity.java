package cn.gxy.livedatbus;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.Observer;
import livedatabus.LiveDataBus;


/**
 * 测试 在发送后 订阅的用户
 */
public class TextCreationActivity extends AppCompatActivity {
    private Button button;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_creation);
        button=findViewById(R.id.bt);

        //订阅
        LiveDataBus.getDefault().withCreation("homebean", HomeBean.class).observe(this, new Observer<HomeBean>() {
            @Override
            public void onChanged(HomeBean homeBean) {
                //订阅结果回调
                button.setText(homeBean.getName());
            }
        });

    }


}
