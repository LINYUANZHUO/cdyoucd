package com.vkejun.cdyoucd.activity;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.vkejun.cdyoucd.R;
import com.vkejun.cdyoucd.bmob.Couple;

import cn.bmob.v3.Bmob;
import cn.bmob.v3.exception.BmobException;
import cn.bmob.v3.listener.SaveListener;

public class CoupleActivity extends Activity
{
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_couple);

        Bmob.initialize(this,"6ab80c2f22a6f8a2e91a0c94c86d8845");
        //直接改为自己的Application ID就能用了，其他代码不用改，Bmob也不用管，提交成功后自动生成表，列和行。


    }

    public void xiaohengonclick(View view)
    {
        final EditText edittext1=(EditText)findViewById(R.id.mainEditText1);
        final EditText edittext2=(EditText)findViewById(R.id.mainEditText2);

        String edit1=edittext1.getText().toString();
        String edit2=edittext2.getText().toString();

        int textlong=edittext1.length();

        if(edit1.equals("")||edit2.equals(""))
        {
            Toast.makeText(CoupleActivity.this,"不可以留空哦！",Toast.LENGTH_SHORT).show();
        }
        else if(textlong<15)
        {
            Toast.makeText(CoupleActivity.this,"不能少于15字哦！",Toast.LENGTH_SHORT).show();
        }
        else
        {
            Couple vkejun = new Couple();

            vkejun.setName(edit1);
            vkejun.setAddress(edit2);
            vkejun.save(CoupleActivity.this, new SaveListener(){

                @Override
                public void done(Object o, Object o2) {

                }

                @Override
                public void done(Object o, BmobException e) {

                }


                public void onSuccess()
                {
                    // TODO: Implement this method
                    Toast.makeText(CoupleActivity.this,"反馈成功",Toast.LENGTH_SHORT).show();
                    edittext1.setText("");
                    edittext2.setText("");
                }


                public void onFailure(int p1, String p2)
                {
                    // TODO: Implement this method
                    Toast.makeText(CoupleActivity.this,"反馈失败\n请检查是否连接到网络",Toast.LENGTH_SHORT).show();
                }
            });
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu)
    {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu_couple, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item)
    {
        switch(item.getItemId())
        {
            case R.id.item:
                String QQ号= getResources().getString(R.string.QQ);
                try{
                    startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("mqqwpa://im/chat?chat_type=wpa&uin=1135969606&version=1"+QQ号)));
                }catch(Exception xiaoheng){
                    Toast.makeText(CoupleActivity.this,"转跳异常",Toast.LENGTH_LONG).show();
                }
        }
        return super.onOptionsItemSelected(item);
    }

}
