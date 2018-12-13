package json.android.com.loginapp;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

/**
 * 11225588类似于qq的appid，通过服务器获取后拼接成uri
 *
 * 该model模拟QQ客户端
 */

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        TextView textView = (TextView) findViewById(R.id.msg_tv);
        if (getIntent() != null && getIntent().getData() != null && getIntent().getData().getQueryParameter("type") != null) {
            textView.setText(getIntent().getData().getQueryParameter("type"));
            /*访问服务器，验证appid*/

        }
    }

   public void login(View view){
       /**点击登录后获取关联qq客户端的登录信息，然后回传数据给 AuthActivity */
       Uri uri = Uri.parse("json11225588://android.com.auth/auth?type=哈哈");
       Intent intent = new Intent("json.auth.ACTION");
       intent.setData(uri);
       intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
       startActivity(intent);
       finish();
   }
}
