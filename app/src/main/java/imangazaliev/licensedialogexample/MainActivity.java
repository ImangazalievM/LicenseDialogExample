package imangazaliev.licensedialogexample;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import de.psdev.licensesdialog.LicensesDialog;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        new LicensesDialog.Builder(this)
                .setNotices(R.raw.license)
                .build()
                .showAppCompat();
    }
}
