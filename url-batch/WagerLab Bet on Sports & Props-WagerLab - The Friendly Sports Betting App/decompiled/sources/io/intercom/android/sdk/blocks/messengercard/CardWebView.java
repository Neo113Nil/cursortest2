package io.intercom.android.sdk.blocks.messengercard;

import android.content.Context;
import android.util.AttributeSet;
import android.webkit.WebView;
import io.intercom.android.sdk.Injector;
import io.intercom.android.sdk.m5.data.IntercomEvent;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlinx.coroutines.CoroutineScopeKt;

/* loaded from: classes8.dex */
public class CardWebView extends WebView {
    public CardWebView(Context context) {
        super(context);
    }

    public CardWebView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public CardWebView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public void setUp() {
        getSettings().setAllowFileAccess(false);
        Injector.get().getDataLayer().listenToEvents(CoroutineScopeKt.MainScope(), new Function1() { // from class: io.intercom.android.sdk.blocks.messengercard.CardWebView$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return CardWebView.this.m11057x6ef3e0c2((IntercomEvent) obj);
            }
        });
    }

    /* renamed from: lambda$setUp$0$io-intercom-android-sdk-blocks-messengercard-CardWebView, reason: not valid java name */
    /* synthetic */ Unit m11057x6ef3e0c2(IntercomEvent intercomEvent) {
        if (intercomEvent == IntercomEvent.CardUpdated.INSTANCE) {
            reload();
        }
        return Unit.INSTANCE;
    }
}
