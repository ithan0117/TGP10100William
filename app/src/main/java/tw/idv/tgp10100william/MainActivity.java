package tw.idv.tgp10100william;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
	private Button button;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		findViews();
		handleButton();
	}

	private void findViews() {
		button = findViewById(R.id.button);
	}

	private void handleButton() {
		button.setOnClickListener(view -> {
			Toast.makeText(this, "dfkjghfdlkghfd", Toast.LENGTH_SHORT).show();
		});
	}
}