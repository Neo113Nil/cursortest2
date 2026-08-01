package com.luckycounter.drinkwater;

import android.content.Intent;
import android.os.Bundle;
import g.AbstractActivityC0129i;

/* loaded from: classes.dex */
public final class MainActivity2 extends AbstractActivityC0129i {
    @Override // g.AbstractActivityC0129i, a.l, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        startActivity(new Intent(this, (Class<?>) DashboardActivity.class));
        finish();
    }
}
