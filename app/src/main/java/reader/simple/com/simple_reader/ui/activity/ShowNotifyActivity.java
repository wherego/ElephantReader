package reader.simple.com.simple_reader.ui.activity;

import android.widget.ImageView;

import com.umeng.analytics.MobclickAgent;

import butterknife.InjectView;
import reader.simple.com.simple_reader.R;
import reader.simple.com.simple_reader.ui.activity.base.BaseActivity;
import reader.simple.com.simple_reader.ui.dialog.OperationDialogFragment;

public class ShowNotifyActivity extends BaseActivity {

    @InjectView(R.id.notify_image)
    ImageView notifyImage;

    @Override
    protected boolean pendingTransition() {
        return false;
    }

    @Override
    protected TransitionMode getTransitionMode() {
        return null;
    }

    @Override
    protected int getContentViewLayoutID() {
        return R.layout.activity_show_notify;
    }

    @Override
    protected void initViewsAndEvents() {
        showDialogFragment();
        MobclickAgent.onEvent(this,"notification");
        notifyImage.setOnClickListener(v -> {
            showDialogFragment();
        });

    }

    private void showDialogFragment() {
        OperationDialogFragment.getInstance().show(getSupportFragmentManager(), "notify");
    }

}
