package com.mbridge.msdk.foundation.fragment;

import android.view.KeyEvent;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.viewmodel.CreationExtras;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes4.dex */
public class BaseFragment extends Fragment {
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return false;
    }

    @Override // androidx.fragment.app.Fragment, androidx.lifecycle.HasDefaultViewModelProviderFactory
    @NotNull
    public /* bridge */ /* synthetic */ CreationExtras getDefaultViewModelCreationExtras() {
        return super.getDefaultViewModelCreationExtras();
    }
}
