package io.intercom.android.sdk.m5.conversation.ui.components.composer;

import androidx.media3.extractor.text.ttml.TtmlNode;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: SoundWaveVisualization.kt */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0005\b\u0002\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u000e\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\tJ\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\t0\u0011J\u0016\u0010\u0012\u001a\u00020\u000e2\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0014J\u0006\u0010\u0016\u001a\u00020\u0003J\u000e\u0010\u0017\u001a\u00020\u000e2\u0006\u0010\u0018\u001a\u00020\u0003R\u000e\u0010\u0006\u001a\u00020\u0003X\u0082\u000e¢\u0006\u0002\n\u0000R\u0018\u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\bX\u0082\u000e¢\u0006\u0004\n\u0002\u0010\nR\u000e\u0010\u000b\u001a\u00020\u0003X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0003X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0019"}, d2 = {"Lio/intercom/android/sdk/m5/conversation/ui/components/composer/WaveformBuffer;", "", "initialCapacity", "", "<init>", "(I)V", "capacity", "elements", "", "Lio/intercom/android/sdk/m5/conversation/ui/components/composer/WaveformElement;", "[Lio/intercom/android/sdk/m5/conversation/ui/components/composer/WaveformElement;", TtmlNode.TAG_HEAD, "size", "addElement", "", "element", "getAllElements", "", "cleanupOldElements", "currentTime", "", "maxAge", "getCurrentSize", "resizeBuffer", "newCapacity", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes8.dex */
final class WaveformBuffer {
    private int capacity;
    private WaveformElement[] elements;
    private int head;
    private int size;

    public WaveformBuffer() {
        this(0, 1, null);
    }

    public WaveformBuffer(int i) {
        this.capacity = i;
        WaveformElement[] waveformElementArr = new WaveformElement[i];
        for (int i2 = 0; i2 < i; i2++) {
            waveformElementArr[i2] = null;
        }
        this.elements = waveformElementArr;
    }

    public /* synthetic */ WaveformBuffer(int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 70 : i);
    }

    public final void addElement(WaveformElement element) {
        Intrinsics.checkNotNullParameter(element, "element");
        WaveformElement[] waveformElementArr = this.elements;
        int i = this.head;
        waveformElementArr[i] = element;
        int i2 = this.capacity;
        this.head = (i + 1) % i2;
        int i3 = this.size;
        if (i3 < i2) {
            this.size = i3 + 1;
        }
    }

    public final List<WaveformElement> getAllElements() {
        ArrayList arrayList = new ArrayList();
        int i = this.size;
        for (int i2 = 0; i2 < i; i2++) {
            int i3 = (this.head - this.size) + i2;
            int i4 = this.capacity;
            WaveformElement waveformElement = this.elements[(i3 + i4) % i4];
            if (waveformElement != null) {
                arrayList.add(waveformElement);
            }
        }
        return arrayList;
    }

    public final void cleanupOldElements(long currentTime, long maxAge) {
        int i = this.head;
        int i2 = this.size;
        int i3 = this.capacity;
        int i4 = ((i - i2) + i3) % i3;
        int i5 = 0;
        for (int i6 = 0; i6 < i2; i6++) {
            int i7 = (this.head - this.size) + i6;
            int i8 = this.capacity;
            int i9 = (i7 + i8) % i8;
            WaveformElement waveformElement = this.elements[i9];
            if (waveformElement != null && currentTime - waveformElement.getTimestamp() <= maxAge) {
                if (i9 != i4) {
                    WaveformElement[] waveformElementArr = this.elements;
                    waveformElementArr[i4] = waveformElement;
                    waveformElementArr[i9] = null;
                }
                i4 = (i4 + 1) % this.capacity;
                i5++;
            } else {
                this.elements[i9] = null;
            }
        }
        this.size = i5;
        this.head = i4;
    }

    /* renamed from: getCurrentSize, reason: from getter */
    public final int getSize() {
        return this.size;
    }

    public final void resizeBuffer(int newCapacity) {
        int i = this.capacity;
        if (newCapacity == i) {
            return;
        }
        WaveformElement[] waveformElementArr = this.elements;
        int i2 = this.head;
        int i3 = this.size;
        this.capacity = newCapacity;
        WaveformElement[] waveformElementArr2 = new WaveformElement[newCapacity];
        for (int i4 = 0; i4 < newCapacity; i4++) {
            waveformElementArr2[i4] = null;
        }
        this.elements = waveformElementArr2;
        this.head = 0;
        this.size = 0;
        int min = Math.min(i3, newCapacity);
        for (int i5 = 0; i5 < min; i5++) {
            WaveformElement waveformElement = waveformElementArr[(((i2 - i3) + i5) + i) % i];
            if (waveformElement != null) {
                addElement(waveformElement);
            }
        }
    }
}
