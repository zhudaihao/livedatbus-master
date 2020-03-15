package cn.gxy.livedatbus;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;
import livedatabus.LiveDataBus;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    /**
     * 发布给 所有订阅者
     *
     * @param view
     */
    public void sendAll(View view) {
        HomeBean homeBean = new HomeBean("张三");
        LiveDataBus.getDefault().with("homebean", HomeBean.class).postValue(homeBean);

        startActivity(new Intent(this,TextAllActivity.class));
    }


    /**
     * 发布给 创建的订阅者
     *
     * @param view
     */
    public void sendCreation(View view) {
        HomeBean homeBean = new HomeBean("李四");
        LiveDataBus.getDefault().withCreation("homebean", HomeBean.class).postValue(homeBean);

        startActivity(new Intent(this,TextCreationActivity.class));
    }

}
