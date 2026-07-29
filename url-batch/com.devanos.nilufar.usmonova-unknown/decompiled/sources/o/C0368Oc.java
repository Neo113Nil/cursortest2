package o;

import android.content.Intent;
import android.content.IntentSender;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import java.util.Arrays;
import java.util.HashSet;

/* renamed from: o.Oc, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0368Oc extends W1 {
    public final /* synthetic */ AbstractActivityC0446Rc h;

    public C0368Oc(AbstractActivityC0446Rc abstractActivityC0446Rc) {
        this.h = abstractActivityC0446Rc;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // o.W1
    public final void b(int i, N1 n1, Object obj) {
        Bundle bundle;
        int i2;
        AbstractActivityC0446Rc abstractActivityC0446Rc = this.h;
        M1 b = n1.b(abstractActivityC0446Rc, obj);
        if (b != null) {
            new Handler(Looper.getMainLooper()).post(new RunnableC0342Nc(i, 0, this, b));
            return;
        }
        Intent a = n1.a(abstractActivityC0446Rc, obj);
        if (a.getExtras() != null) {
            Bundle extras = a.getExtras();
            AbstractC0048Bt.k(extras);
            if (extras.getClassLoader() == null) {
                a.setExtrasClassLoader(abstractActivityC0446Rc.getClassLoader());
            }
        }
        if (a.hasExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE")) {
            bundle = a.getBundleExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE");
            a.removeExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE");
        } else {
            bundle = null;
        }
        Bundle bundle2 = bundle;
        if ("androidx.activity.result.contract.action.REQUEST_PERMISSIONS".equals(a.getAction())) {
            String[] stringArrayExtra = a.getStringArrayExtra("androidx.activity.result.contract.extra.PERMISSIONS");
            if (stringArrayExtra == null) {
                stringArrayExtra = new String[0];
            }
            HashSet hashSet = new HashSet();
            for (int i3 = 0; i3 < stringArrayExtra.length; i3++) {
                if (TextUtils.isEmpty(stringArrayExtra[i3])) {
                    throw new IllegalArgumentException(AbstractC1888sN.l(new StringBuilder("Permission request for permissions "), Arrays.toString(stringArrayExtra), " must not contain null or empty values"));
                }
                if (Build.VERSION.SDK_INT < 33 && TextUtils.equals(stringArrayExtra[i3], "android.permission.POST_NOTIFICATIONS")) {
                    hashSet.add(Integer.valueOf(i3));
                }
            }
            int size = hashSet.size();
            String[] strArr = size > 0 ? new String[stringArrayExtra.length - size] : stringArrayExtra;
            if (size > 0) {
                if (size == stringArrayExtra.length) {
                    return;
                }
                int i4 = 0;
                for (int i5 = 0; i5 < stringArrayExtra.length; i5++) {
                    if (!hashSet.contains(Integer.valueOf(i5))) {
                        strArr[i4] = stringArrayExtra[i5];
                        i4++;
                    }
                }
            }
            if (abstractActivityC0446Rc instanceof G1) {
                ((G1) abstractActivityC0446Rc).validateRequestPermissionsRequestCode(i);
            }
            F1.b(abstractActivityC0446Rc, stringArrayExtra, i);
            return;
        }
        if (!"androidx.activity.result.contract.action.INTENT_SENDER_REQUEST".equals(a.getAction())) {
            abstractActivityC0446Rc.startActivityForResult(a, i, bundle2);
            return;
        }
        C1723pt c1723pt = (C1723pt) a.getParcelableExtra("androidx.activity.result.contract.extra.INTENT_SENDER_REQUEST");
        try {
            AbstractC0048Bt.k(c1723pt);
            i2 = i;
            try {
                abstractActivityC0446Rc.startIntentSenderForResult(c1723pt.h, i2, c1723pt.i, c1723pt.j, c1723pt.k, 0, bundle2);
            } catch (IntentSender.SendIntentException e) {
                e = e;
                new Handler(Looper.getMainLooper()).post(new RunnableC0342Nc(i2, 1, this, e));
            }
        } catch (IntentSender.SendIntentException e2) {
            e = e2;
            i2 = i;
        }
    }
}
