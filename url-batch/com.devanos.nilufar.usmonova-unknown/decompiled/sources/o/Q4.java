package o;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.CompoundButton;
import android.widget.TextView;
import com.google.firebase.messaging.Constants;
import java.util.HashMap;

/* loaded from: classes.dex */
public final class Q4 {
    public Object a = null;
    public Object b = null;
    public boolean c = false;
    public boolean d = false;
    public boolean e;
    public Object f;

    public /* synthetic */ Q4(TextView textView) {
        this.f = textView;
    }

    public static HashMap d(byte[] bArr) {
        HashMap hashMap = new HashMap();
        hashMap.put("enabled", Boolean.TRUE);
        hashMap.put(Constants.ScionAnalytics.MessageType.DATA_MESSAGE, bArr);
        return hashMap;
    }

    public void a() {
        CompoundButton compoundButton = (CompoundButton) this.f;
        Drawable a = AbstractC0006Ad.a(compoundButton);
        if (a != null) {
            if (this.c || this.d) {
                Drawable mutate = a.mutate();
                if (this.c) {
                    AbstractC1187hj.h(mutate, (ColorStateList) this.a);
                }
                if (this.d) {
                    AbstractC1187hj.i(mutate, (PorterDuff.Mode) this.b);
                }
                if (mutate.isStateful()) {
                    mutate.setState(compoundButton.getDrawableState());
                }
                compoundButton.setButtonDrawable(mutate);
            }
        }
    }

    public void b() {
        P4 p4 = (P4) this.f;
        Drawable checkMarkDrawable = p4.getCheckMarkDrawable();
        if (checkMarkDrawable != null) {
            if (this.c || this.d) {
                Drawable mutate = checkMarkDrawable.mutate();
                if (this.c) {
                    AbstractC1187hj.h(mutate, (ColorStateList) this.a);
                }
                if (this.d) {
                    AbstractC1187hj.i(mutate, (PorterDuff.Mode) this.b);
                }
                if (mutate.isStateful()) {
                    mutate.setState(p4.getDrawableState());
                }
                p4.setCheckMarkDrawable(mutate);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x005c A[Catch: all -> 0x003b, TryCatch #1 {all -> 0x003b, blocks: (B:3:0x0022, B:5:0x0029, B:8:0x002f, B:9:0x0055, B:11:0x005c, B:12:0x0063, B:14:0x006a, B:21:0x003e, B:23:0x0044, B:25:0x004a), top: B:2:0x0022 }] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x006a A[Catch: all -> 0x003b, TRY_LEAVE, TryCatch #1 {all -> 0x003b, blocks: (B:3:0x0022, B:5:0x0029, B:8:0x002f, B:9:0x0055, B:11:0x005c, B:12:0x0063, B:14:0x006a, B:21:0x003e, B:23:0x0044, B:25:0x004a), top: B:2:0x0022 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void c(AttributeSet attributeSet, int i) {
        int resourceId;
        int resourceId2;
        CompoundButton compoundButton = (CompoundButton) this.f;
        Context context = compoundButton.getContext();
        int[] iArr = AbstractC1886sL.m;
        C0950e6 F = C0950e6.F(context, attributeSet, iArr, i);
        TypedArray typedArray = (TypedArray) F.i;
        AZ.g(compoundButton, compoundButton.getContext(), iArr, attributeSet, (TypedArray) F.i, i);
        try {
            if (typedArray.hasValue(1) && (resourceId2 = typedArray.getResourceId(1, 0)) != 0) {
                try {
                    compoundButton.setButtonDrawable(EB.t(compoundButton.getContext(), resourceId2));
                } catch (Resources.NotFoundException unused) {
                }
                if (typedArray.hasValue(2)) {
                    AbstractC2366zd.c(compoundButton, F.w(2));
                }
                if (typedArray.hasValue(3)) {
                    AbstractC2366zd.d(compoundButton, AbstractC1317jj.b(typedArray.getInt(3, -1), null));
                }
                F.L();
            }
            if (typedArray.hasValue(0) && (resourceId = typedArray.getResourceId(0, 0)) != 0) {
                compoundButton.setButtonDrawable(EB.t(compoundButton.getContext(), resourceId));
            }
            if (typedArray.hasValue(2)) {
            }
            if (typedArray.hasValue(3)) {
            }
            F.L();
        } catch (Throwable th) {
            F.L();
            throw th;
        }
    }
}
