package io.bidmachine.analytics.internal.h;

import io.bidmachine.analytics.ReaderConfig;
import io.bidmachine.analytics.internal.g.h;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: io.bidmachine.analytics.internal.h.c, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public interface InterfaceC5908c {
    void a(List list);

    /* renamed from: io.bidmachine.analytics.internal.h.c$a */
    public static final class a {
        private final ReaderConfig.Rule a;
        private final String b;
        private final h c;

        public a(ReaderConfig.Rule rule, String str, h hVar) {
            this.a = rule;
            this.b = str;
            this.c = hVar;
        }

        public final String a() {
            return this.b;
        }

        public final h b() {
            return this.c;
        }

        public final ReaderConfig.Rule c() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return Intrinsics.areEqual(this.a, aVar.a) && Intrinsics.areEqual(this.b, aVar.b) && Intrinsics.areEqual(this.c, aVar.c);
        }

        public int hashCode() {
            int hashCode = this.a.hashCode() * 31;
            String str = this.b;
            int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
            h hVar = this.c;
            return hashCode2 + (hVar != null ? hVar.hashCode() : 0);
        }

        public String toString() {
            return "Data(rule=" + this.a + ", dataHash=" + this.b + ", error=" + this.c + ')';
        }

        public /* synthetic */ a(ReaderConfig.Rule rule, String str, h hVar, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(rule, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : hVar);
        }
    }
}
