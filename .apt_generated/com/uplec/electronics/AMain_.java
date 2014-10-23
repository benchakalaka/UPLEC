//
// DO NOT EDIT THIS FILE, IT HAS BEEN GENERATED USING AndroidAnnotations 3.0.1.
//


package com.uplec.electronics;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnLongClickListener;
import android.view.ViewGroup.LayoutParams;
import android.view.animation.AnimationUtils;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import com.uplec.electronics.R.anim;
import com.uplec.electronics.R.id;
import com.uplec.electronics.R.layout;
import com.uplec.electronics.utils.AppPref_;
import org.androidannotations.api.BackgroundExecutor;
import org.androidannotations.api.view.HasViews;
import org.androidannotations.api.view.OnViewChangedListener;
import org.androidannotations.api.view.OnViewChangedNotifier;

public final class AMain_
    extends AMain
    implements HasViews, OnViewChangedListener
{

    private final OnViewChangedNotifier onViewChangedNotifier_ = new OnViewChangedNotifier();
    private Handler handler_ = new Handler(Looper.getMainLooper());

    @Override
    public void onCreate(Bundle savedInstanceState) {
        OnViewChangedNotifier previousNotifier = OnViewChangedNotifier.replaceNotifier(onViewChangedNotifier_);
        init_(savedInstanceState);
        super.onCreate(savedInstanceState);
        OnViewChangedNotifier.replaceNotifier(previousNotifier);
        setContentView(layout.activity_main);
    }

    private void init_(Bundle savedInstanceState) {
        appPref = new AppPref_(this);
        OnViewChangedNotifier.registerOnViewChangedListener(this);
        animationShaking = AnimationUtils.loadAnimation(this, anim.shake);
        animationChangingMode = AnimationUtils.loadAnimation(this, anim.fade_in);
    }

    @Override
    public void setContentView(int layoutResID) {
        super.setContentView(layoutResID);
        onViewChangedNotifier_.notifyViewChanged(this);
    }

    @Override
    public void setContentView(View view, LayoutParams params) {
        super.setContentView(view, params);
        onViewChangedNotifier_.notifyViewChanged(this);
    }

    @Override
    public void setContentView(View view) {
        super.setContentView(view);
        onViewChangedNotifier_.notifyViewChanged(this);
    }

    public static AMain_.IntentBuilder_ intent(Context context) {
        return new AMain_.IntentBuilder_(context);
    }

    public static AMain_.IntentBuilder_ intent(android.app.Fragment fragment) {
        return new AMain_.IntentBuilder_(fragment);
    }

    public static AMain_.IntentBuilder_ intent(android.support.v4.app.Fragment supportFragment) {
        return new AMain_.IntentBuilder_(supportFragment);
    }

    @Override
    public void onViewChanged(HasViews hasViews) {
        tw1 = ((TextView) hasViews.findViewById(id.tw1));
        ivMode = ((ImageView) hasViews.findViewById(id.ivMode));
        tw9 = ((TextView) hasViews.findViewById(id.tw9));
        tw8 = ((TextView) hasViews.findViewById(id.tw8));
        etNumber = ((EditText) hasViews.findViewById(id.etNumber));
        tvWrite = ((TextView) hasViews.findViewById(id.tvWrite));
        ivClear = ((ImageView) hasViews.findViewById(id.ivClear));
        tw2 = ((TextView) hasViews.findViewById(id.tw2));
        tvWriteClearNDEFMessage = ((TextView) hasViews.findViewById(id.tvWriteClearNDEFMessage));
        twUp = ((TextView) hasViews.findViewById(id.twUp));
        twDown = ((TextView) hasViews.findViewById(id.twDown));
        tw6 = ((TextView) hasViews.findViewById(id.tw6));
        tw4 = ((TextView) hasViews.findViewById(id.tw4));
        tw5 = ((TextView) hasViews.findViewById(id.tw5));
        tw7 = ((TextView) hasViews.findViewById(id.tw7));
        tw0 = ((TextView) hasViews.findViewById(id.tw0));
        tvSettings = ((TextView) hasViews.findViewById(id.tvSettings));
        tw3 = ((TextView) hasViews.findViewById(id.tw3));
        tvRead = ((TextView) hasViews.findViewById(id.tvRead));
        {
            View view = hasViews.findViewById(id.tvSettings);
            if (view!= null) {
                view.setOnClickListener(new OnClickListener() {


                    @Override
                    public void onClick(View view) {
                        AMain_.this.tvSettings();
                    }

                }
                );
            }
        }
        {
            View view = hasViews.findViewById(id.twDown);
            if (view!= null) {
                view.setOnClickListener(new OnClickListener() {


                    @Override
                    public void onClick(View view) {
                        AMain_.this.twDown();
                    }

                }
                );
            }
        }
        {
            View view = hasViews.findViewById(id.tw1);
            if (view!= null) {
                view.setOnClickListener(new OnClickListener() {


                    @Override
                    public void onClick(View view) {
                        AMain_.this.tw1();
                    }

                }
                );
            }
        }
        {
            View view = hasViews.findViewById(id.tw8);
            if (view!= null) {
                view.setOnClickListener(new OnClickListener() {


                    @Override
                    public void onClick(View view) {
                        AMain_.this.tw8();
                    }

                }
                );
            }
        }
        {
            View view = hasViews.findViewById(id.ivMode);
            if (view!= null) {
                view.setOnClickListener(new OnClickListener() {


                    @Override
                    public void onClick(View view) {
                        AMain_.this.ivMode();
                    }

                }
                );
            }
        }
        {
            View view = hasViews.findViewById(id.tw3);
            if (view!= null) {
                view.setOnClickListener(new OnClickListener() {


                    @Override
                    public void onClick(View view) {
                        AMain_.this.tw3();
                    }

                }
                );
            }
        }
        {
            View view = hasViews.findViewById(id.tvWriteClearNDEFMessage);
            if (view!= null) {
                view.setOnClickListener(new OnClickListener() {


                    @Override
                    public void onClick(View view) {
                        AMain_.this.tvWriteClearNDEFMessage();
                    }

                }
                );
            }
        }
        {
            View view = hasViews.findViewById(id.tw5);
            if (view!= null) {
                view.setOnClickListener(new OnClickListener() {


                    @Override
                    public void onClick(View view) {
                        AMain_.this.tw5();
                    }

                }
                );
            }
        }
        {
            View view = hasViews.findViewById(id.tw6);
            if (view!= null) {
                view.setOnClickListener(new OnClickListener() {


                    @Override
                    public void onClick(View view) {
                        AMain_.this.tw6();
                    }

                }
                );
            }
        }
        {
            View view = hasViews.findViewById(id.ivClear);
            if (view!= null) {
                view.setOnClickListener(new OnClickListener() {


                    @Override
                    public void onClick(View view) {
                        AMain_.this.ivClear();
                    }

                }
                );
            }
        }
        {
            View view = hasViews.findViewById(id.twUp);
            if (view!= null) {
                view.setOnClickListener(new OnClickListener() {


                    @Override
                    public void onClick(View view) {
                        AMain_.this.twUp();
                    }

                }
                );
            }
        }
        {
            View view = hasViews.findViewById(id.tw0);
            if (view!= null) {
                view.setOnClickListener(new OnClickListener() {


                    @Override
                    public void onClick(View view) {
                        AMain_.this.tw0();
                    }

                }
                );
            }
        }
        {
            View view = hasViews.findViewById(id.tvRead);
            if (view!= null) {
                view.setOnClickListener(new OnClickListener() {


                    @Override
                    public void onClick(View view) {
                        AMain_.this.tvRead();
                    }

                }
                );
            }
        }
        {
            View view = hasViews.findViewById(id.tw7);
            if (view!= null) {
                view.setOnClickListener(new OnClickListener() {


                    @Override
                    public void onClick(View view) {
                        AMain_.this.tw7();
                    }

                }
                );
            }
        }
        {
            View view = hasViews.findViewById(id.tw4);
            if (view!= null) {
                view.setOnClickListener(new OnClickListener() {


                    @Override
                    public void onClick(View view) {
                        AMain_.this.tw4();
                    }

                }
                );
            }
        }
        {
            View view = hasViews.findViewById(id.tvWrite);
            if (view!= null) {
                view.setOnClickListener(new OnClickListener() {


                    @Override
                    public void onClick(View view) {
                        AMain_.this.tvWrite();
                    }

                }
                );
            }
        }
        {
            View view = hasViews.findViewById(id.tw2);
            if (view!= null) {
                view.setOnClickListener(new OnClickListener() {


                    @Override
                    public void onClick(View view) {
                        AMain_.this.tw2();
                    }

                }
                );
            }
        }
        {
            View view = hasViews.findViewById(id.tw9);
            if (view!= null) {
                view.setOnClickListener(new OnClickListener() {


                    @Override
                    public void onClick(View view) {
                        AMain_.this.tw9();
                    }

                }
                );
            }
        }
        {
            View view = hasViews.findViewById(id.ivClear);
            if (view!= null) {
                view.setOnLongClickListener(new OnLongClickListener() {


                    @Override
                    public boolean onLongClick(View view) {
                        AMain_.this.ivClear(view);
                        return true;
                    }

                }
                );
            }
        }
        {
            final TextView view = ((TextView) hasViews.findViewById(id.etNumber));
            if (view!= null) {
                view.addTextChangedListener(new TextWatcher() {


                    @Override
                    public void beforeTextChanged(CharSequence s, int start, int count, int after) {
                    }

                    @Override
                    public void onTextChanged(CharSequence s, int start, int before, int count) {
                    }

                    @Override
                    public void afterTextChanged(Editable s) {
                        AMain_.this.etNumber(view);
                    }

                }
                );
            }
        }
        afterViews();
    }

    @Override
    public void processWriteResponse(final byte[] response) {
        handler_.post(new Runnable() {


            @Override
            public void run() {
                AMain_.super.processWriteResponse(response);
            }

        }
        );
    }

    @Override
    public void processReadResponse(final byte[] response, final int numberOfBlock, final byte[] addressStart) {
        handler_.post(new Runnable() {


            @Override
            public void run() {
                AMain_.super.processReadResponse(response, numberOfBlock, addressStart);
            }

        }
        );
    }

    @Override
    public void toggleProgressDialogState(final boolean isVisible) {
        handler_.post(new Runnable() {


            @Override
            public void run() {
                AMain_.super.toggleProgressDialogState(isVisible);
            }

        }
        );
    }

    @Override
    public void readBytesRaw(final String startAddr) {
        BackgroundExecutor.execute(new BackgroundExecutor.Task("", 0, "") {


            @Override
            public void execute() {
                try {
                    AMain_.super.readBytesRaw(startAddr);
                } catch (Throwable e) {
                    Thread.getDefaultUncaughtExceptionHandler().uncaughtException(Thread.currentThread(), e);
                }
            }

        }
        );
    }

    @Override
    public void writeBytesRaw(final byte[] arrayToWrite, final String startAddr) {
        BackgroundExecutor.execute(new BackgroundExecutor.Task("", 0, "") {


            @Override
            public void execute() {
                try {
                    AMain_.super.writeBytesRaw(arrayToWrite, startAddr);
                } catch (Throwable e) {
                    Thread.getDefaultUncaughtExceptionHandler().uncaughtException(Thread.currentThread(), e);
                }
            }

        }
        );
    }

    public static class IntentBuilder_ {

        private Context context_;
        private final Intent intent_;
        private android.app.Fragment fragment_;
        private android.support.v4.app.Fragment fragmentSupport_;

        public IntentBuilder_(Context context) {
            context_ = context;
            intent_ = new Intent(context, AMain_.class);
        }

        public IntentBuilder_(android.app.Fragment fragment) {
            fragment_ = fragment;
            context_ = fragment.getActivity();
            intent_ = new Intent(context_, AMain_.class);
        }

        public IntentBuilder_(android.support.v4.app.Fragment fragment) {
            fragmentSupport_ = fragment;
            context_ = fragment.getActivity();
            intent_ = new Intent(context_, AMain_.class);
        }

        public Intent get() {
            return intent_;
        }

        public AMain_.IntentBuilder_ flags(int flags) {
            intent_.setFlags(flags);
            return this;
        }

        public void start() {
            context_.startActivity(intent_);
        }

        public void startForResult(int requestCode) {
            if (fragmentSupport_!= null) {
                fragmentSupport_.startActivityForResult(intent_, requestCode);
            } else {
                if (fragment_!= null) {
                    fragment_.startActivityForResult(intent_, requestCode);
                } else {
                    if (context_ instanceof Activity) {
                        ((Activity) context_).startActivityForResult(intent_, requestCode);
                    } else {
                        context_.startActivity(intent_);
                    }
                }
            }
        }

    }

}