package com.applozic.mobicomkit.uiwidgets.kommunicate.utils;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.support.v4.content.ContextCompat;
import android.view.View;
import android.widget.RelativeLayout;

import com.applozic.mobicomkit.api.account.user.MobiComUserPreference;

public class KmUtils {

    public static boolean isServiceDisconnected(Context context, boolean isAgentApp, RelativeLayout customToolbarLayout) {
        boolean isDebuggable = (0 != (context.getApplicationInfo().flags & ApplicationInfo.FLAG_DEBUGGABLE));
        boolean disconnect = !isAgentApp
                && MobiComUserPreference.getInstance(context).getPricingPackage() == PackageType.STARTUP.getValue()
                && !isDebuggable;
        if (customToolbarLayout != null) {
            customToolbarLayout.setVisibility(View.GONE);
        }
        return disconnect;
    }

    public static void setBackground(Context context, View view, int resId) {
        final int sdk = android.os.Build.VERSION.SDK_INT;
        if (sdk < android.os.Build.VERSION_CODES.JELLY_BEAN) {
            view.setBackgroundDrawable(ContextCompat.getDrawable(context, resId));
        } else {
            view.setBackground(ContextCompat.getDrawable(context, resId));
        }
    }

    public enum PackageType {
        STARTUP(101),
        PER_AGENT_MONTHLY(102),
        PER_AGENT_YEARLY(103),
        GROWTH_MONTHLY(104),
        ENTERPRISE_MONTHLY(105),
        ENTERPRISE_YEARLY(106),
        EARLY_BIRD_MONTHLY(107),
        EARLY_BIRD_YEARLY(108);

        private int value;

        PackageType(int value) {
            this.value = value;
        }

        public int getValue() {
            return value;
        }
    }
}
