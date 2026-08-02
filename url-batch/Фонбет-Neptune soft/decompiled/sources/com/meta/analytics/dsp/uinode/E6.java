package com.meta.analytics.dsp.uinode;

import com.facebook.ads.internal.exoplayer2.thirdparty.offline.DownloadAction;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;

/* loaded from: assets/audience_network.dex */
public class E6 implements Runnable {
    public final /* synthetic */ E7 A00;
    public final /* synthetic */ DownloadAction[] A01;

    public E6(E7 e7, DownloadAction[] downloadActionArr) {
        this.A00 = e7;
        this.A01 = downloadActionArr;
    }

    /* JADX WARN: Incorrect condition in loop: B:24:0x0091 */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        boolean z;
        ArrayList arrayList;
        ArrayList arrayList2;
        CopyOnWriteArraySet copyOnWriteArraySet;
        ArrayList arrayList3;
        ArrayList arrayList4;
        int i;
        ArrayList arrayList5;
        if (KL.A02(this)) {
            return;
        }
        try {
            z = this.A00.A00.A03;
            if (z) {
                return;
            }
            arrayList = this.A00.A00.A0C;
            ArrayList arrayList6 = new ArrayList(arrayList);
            arrayList2 = this.A00.A00.A0C;
            arrayList2.clear();
            for (DownloadAction downloadAction : this.A01) {
                this.A00.A00.A02(downloadAction);
            }
            this.A00.A00.A02 = true;
            copyOnWriteArraySet = this.A00.A00.A0D;
            Iterator it = copyOnWriteArraySet.iterator();
            while (it.hasNext()) {
                ((E9) it.next()).ABk(this.A00.A00);
            }
            if (!arrayList6.isEmpty()) {
                arrayList5 = this.A00.A00.A0C;
                arrayList5.addAll(arrayList6);
                this.A00.A00.A0B();
            }
            this.A00.A00.A0A();
            for (int i2 = 0; i2 < arrayList3.size(); i2++) {
                arrayList4 = this.A00.A00.A0C;
                ED ed = (ED) arrayList4.get(i2);
                i = ed.A06;
                if (i == 0) {
                    this.A00.A00.A0D(ed);
                }
            }
        } catch (Throwable th) {
            KL.A00(th, this);
        }
    }
}
