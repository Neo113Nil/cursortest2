package com.my.target;

import com.my.target.e;
import com.my.target.internal.api.internalnativead.models.InternalImageData;
import com.my.target.internal.api.internalnativead.models.adchoices.InternalNativeAdChoices;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-376f9cbbf0a7df308b3ad5c16a6608bc59316f0ad6051cf26b365c8cc4cd0036 */
/* loaded from: classes6.dex */
public class m7 implements InternalNativeAdChoices {
    private final e a;
    private final InternalImageData b;
    private final List c = new ArrayList();

    private m7(e eVar) {
        this.a = eVar;
        this.b = i7.a(eVar.g());
        List b = eVar.b();
        if (b != null) {
            Iterator it = b.iterator();
            while (it.hasNext()) {
                this.c.add(new s7((e.a) it.next()));
            }
        }
    }

    public static m7 a(e eVar) {
        return new m7(eVar);
    }

    public String getAboutCompany() {
        return this.a.a();
    }

    public List getAdChoicesOptionList() {
        return this.c;
    }

    public InternalImageData getIcon() {
        return this.b;
    }
}
