package sg.edu.np.mad.madpractical;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    User user = new User ("Jimmy", "Greetings traveller", 1, true);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView usernameTextView = (TextView) findViewById(R.id.usernameTextView);
        usernameTextView.setText(user.name);

        TextView descriptionTextView = (TextView) findViewById(R.id.descriptionTextView);
        descriptionTextView.setText(user.description);

        Button followButton = (Button) findViewById(R.id.followButton);
        followButton.setText(user.followed ? "Unfollow" : "Follow");

        followButton.setOnClickListener(view -> {
            user.followed = !user.followed;
            Button followButton1 = (Button) view;
            followButton1.setText(user.followed ? "Unfollow" : "Follow");
        });
    }
}