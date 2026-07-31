package com.google.android.gms.internal.base;

import android.graphics.drawable.Drawable;
import androidx.annotation.Nullable;

/* compiled from: com.google.android.gms:play-services-base@@18.6.0 */
/* loaded from: classes13.dex */
final class zag extends Drawable.ConstantState {
    int zaa;
    int zab;

    zag(@Nullable zag zagVar) {
        if (zagVar != null) {
            this.zaa = zagVar.zaa;
            this.zab = zagVar.zab;
        }
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final int getChangingConfigurations() {
        return this.zaa;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable() {
        return new zai(this);
    }
}
