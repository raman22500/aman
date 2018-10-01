package thirtyfour.com.toastlibrary;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

public class ToastMessage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_toast_message);
        Toast.makeText(this, "This is my first libaray message", Toast.LENGTH_SHORT).show();
    }
}
