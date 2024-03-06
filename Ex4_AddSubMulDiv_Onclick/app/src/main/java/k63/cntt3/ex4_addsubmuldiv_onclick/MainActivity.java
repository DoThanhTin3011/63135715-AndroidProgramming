package k63.cntt3.ex4_addsubmuldiv_onclick;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    EditText editTextSo1;
    EditText editTextSo2;
    EditText editTextKetQua;
    Button nutCong,nutTru,nutNhan,nutChia;
    void TimDieuKhien(){
        EditText editTextSo1 = (EditText)findViewById(R.id.edtSO1);
        EditText editTextSo2 = (EditText)findViewById(R.id.edtSO2);
        EditText editTextKetQua = (EditText)findViewById(R.id.edtKQ);
        nutCong = (Button)findViewById(R.id.btnCong);
        nutTru = (Button)findViewById(R.id.btnTru);
        nutNhan = (Button)findViewById(R.id.btnNhan);
        nutChia = (Button)findViewById(R.id.btnChia);
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        TimDieuKhien();
    }

    public void XuLyCong(View view){


        String so1 = editTextSo1.getText().toString();
        String so2 = editTextSo2.getText().toString();

        float soA = Float.parseFloat(so1);
        float soB = Float.parseFloat(so2);

        float tong = soA + soB;



        String chuoiKQ = String.valueOf(tong);
        editTextKetQua.setText(chuoiKQ);
    }
    public void XuLyTru(View view){


        String so1 = editTextSo1.getText().toString();
        String so2 = editTextSo2.getText().toString();

        float soA = Float.parseFloat(so1);
        float soB = Float.parseFloat(so2);

        float tong = soA - soB;



        String chuoiKQ = String.valueOf(tong);
        editTextKetQua.setText(chuoiKQ);
    }
    public void XuLyNhan(View view){


        String so1 = editTextSo1.getText().toString();
        String so2 = editTextSo2.getText().toString();

        float soA = Float.parseFloat(so1);
        float soB = Float.parseFloat(so2);

        float tong = soA * soB;



        String chuoiKQ = String.valueOf(tong);
        editTextKetQua.setText(chuoiKQ);
    }
    public void XuLyChia(View view){


        String so1 = editTextSo1.getText().toString();
        String so2 = editTextSo2.getText().toString();

        float soA = Float.parseFloat(so1);
        float soB = Float.parseFloat(so2);

        float tong = soA / soB;



        String chuoiKQ = String.valueOf(tong);
        editTextKetQua.setText(chuoiKQ);
    }
}