package io.bidmachine.analytics.internal.i;

import io.bidmachine.analytics.internal.h.AbstractC5909d;
import io.bidmachine.analytics.internal.h.InterfaceC5907b;

/* renamed from: io.bidmachine.analytics.internal.i.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC5912a extends AbstractC5909d {

    /* renamed from: io.bidmachine.analytics.internal.i.a$a, reason: collision with other inner class name */
    public interface InterfaceC1735a {
    }

    /* renamed from: io.bidmachine.analytics.internal.i.a$b */
    public static final class b {
        private final String a;
        private final InterfaceC5907b b;
        private final InterfaceC1735a c;

        public b(String str, InterfaceC5907b interfaceC5907b, InterfaceC1735a interfaceC1735a) {
            this.a = str;
            this.b = interfaceC5907b;
            this.c = interfaceC1735a;
        }

        public final InterfaceC5907b a() {
            return this.b;
        }

        public final InterfaceC1735a b() {
            return this.c;
        }

        public final String c() {
            return this.a;
        }
    }
}
