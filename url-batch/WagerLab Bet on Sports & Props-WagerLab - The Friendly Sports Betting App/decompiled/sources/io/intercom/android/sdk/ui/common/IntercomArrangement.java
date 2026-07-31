package io.intercom.android.sdk.ui.common;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.ui.unit.Density;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: IntercomArrangement.kt */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0007¨\u0006\b"}, d2 = {"Lio/intercom/android/sdk/ui/common/IntercomArrangement;", "", "<init>", "()V", "itemAtBottom", "Landroidx/compose/foundation/layout/Arrangement$Vertical;", "itemIndex", "", "intercom-sdk-ui_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class IntercomArrangement {
    public static final int $stable = 0;
    public static final IntercomArrangement INSTANCE = new IntercomArrangement();

    private IntercomArrangement() {
    }

    public final Arrangement.Vertical itemAtBottom(final int itemIndex) {
        return new Arrangement.Vertical() { // from class: io.intercom.android.sdk.ui.common.IntercomArrangement$itemAtBottom$1
            @Override // androidx.compose.foundation.layout.Arrangement.Vertical
            public void arrange(Density density, int i, int[] sizes, int[] outPositions) {
                Intrinsics.checkNotNullParameter(density, "<this>");
                Intrinsics.checkNotNullParameter(sizes, "sizes");
                Intrinsics.checkNotNullParameter(outPositions, "outPositions");
                int i2 = itemIndex;
                int length = sizes.length;
                int i3 = 0;
                int i4 = 0;
                int i5 = 0;
                while (i3 < length) {
                    int i6 = sizes[i3];
                    int i7 = i4 + 1;
                    if (i4 == i2) {
                        outPositions[i4] = i - i6;
                    } else {
                        outPositions[i4] = i5;
                        i5 += i6;
                    }
                    i3++;
                    i4 = i7;
                }
            }

            public String toString() {
                return "Arrangement#itemAtBottom(" + itemIndex + ')';
            }
        };
    }
}
