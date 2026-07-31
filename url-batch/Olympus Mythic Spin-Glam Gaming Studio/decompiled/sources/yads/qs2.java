package yads;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/* loaded from: classes5.dex */
public abstract class qs2 {
    public static View a(Context context, Class cls, int i, ViewGroup viewGroup) {
        try {
            return (View) cls.cast(LayoutInflater.from(context).inflate(i, viewGroup, false));
        } catch (Exception unused) {
            boolean z = ob1.a;
            return null;
        }
    }
}
