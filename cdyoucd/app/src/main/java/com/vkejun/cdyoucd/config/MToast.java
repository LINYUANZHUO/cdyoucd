package com.vkejun.cdyoucd.config;

import android.animation.ObjectAnimator;
import android.annotation.SuppressLint;
import android.content.Context;
import android.view.animation.BounceInterpolator;
import android.widget.TextView;
import android.widget.Toast;

import androidx.core.content.ContextCompat;

import com.vkejun.cdyoucd.R;

public class MToast extends Toast {
    @SuppressLint({"StaticFieldLeak"})
    private static MToast toast;

    @SuppressLint({"StaticFieldLeak"})
    private static TextView toast_tv;

    public MToast(Context paramContext) { super(paramContext); }

    private static void cancelToast() {
        MToast mToast = toast;
        if (mToast != null)
            mToast.cancel();
    }

    private static void initToast(Context paramContext, CharSequence paramCharSequence) {
        cancelToast();
        toast = new MToast(paramContext);
        toast_tv = new TextView(paramContext);
        toast_tv.setBackground(ContextCompat.getDrawable(paramContext, R.drawable.toast_frame));
        toast_tv.setTextColor(ContextCompat.getColor(paramContext, R.color.colorPrimary));
        toast_tv.setText(paramCharSequence);
        toast.setView(toast_tv);
        toast.setGravity(17, 0, 0);
    }

    public static void show(Context paramContext, CharSequence paramCharSequence) {
        if (paramCharSequence != null) {
            initToast(paramContext, paramCharSequence);
            toast_tv.setPivotY(0.0F);
            toast_tv.setScaleY(0.0F);
            ObjectAnimator objectAnimator = ObjectAnimator.ofFloat(toast_tv, "scaleY", new float[] { 0.0F, 1.0F });
            objectAnimator.setStartDelay(200L);
            objectAnimator.setDuration(800L);
            objectAnimator.setInterpolator(new BounceInterpolator());
            objectAnimator.start();
            toast.show();
        }
    }

    public void cancel() { super.cancel(); }

    public void show() { super.show(); }
}
