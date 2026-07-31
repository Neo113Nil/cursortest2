package com.ironsource.mediationsdk.demandOnly;

import com.ironsource.C4834q2;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes11.dex */
public interface a {

    /* renamed from: com.ironsource.mediationsdk.demandOnly.a$a, reason: collision with other inner class name */
    public static final class C1370a implements a {

        @NotNull
        private final List<C4834q2> a;

        /* JADX WARN: Multi-variable type inference failed */
        public C1370a() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        @Override // com.ironsource.mediationsdk.demandOnly.a
        @Nullable
        public C4834q2 a(@NotNull String instanceName) {
            Object obj;
            Intrinsics.checkNotNullParameter(instanceName, "instanceName");
            Iterator<T> it = this.a.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (Intrinsics.areEqual(((C4834q2) obj).c(), instanceName)) {
                    break;
                }
            }
            return (C4834q2) obj;
        }

        @Override // com.ironsource.mediationsdk.demandOnly.a
        @NotNull
        public String b() {
            if (this.a.isEmpty()) {
                return "";
            }
            return "1" + ((C4834q2) CollectionsKt.first((List) this.a)).c();
        }

        @Override // com.ironsource.mediationsdk.demandOnly.a
        @Nullable
        public C4834q2 get(int i) {
            if (i < 0 || i >= this.a.size()) {
                return null;
            }
            return this.a.get(i);
        }

        @Override // com.ironsource.mediationsdk.demandOnly.a
        public boolean isEmpty() {
            return this.a.isEmpty();
        }

        public C1370a(@NotNull List<C4834q2> waterfall) {
            Intrinsics.checkNotNullParameter(waterfall, "waterfall");
            this.a = waterfall;
        }

        @Override // com.ironsource.mediationsdk.demandOnly.a
        @NotNull
        public List<C4834q2> a() {
            return this.a;
        }

        public /* synthetic */ C1370a(List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? new ArrayList() : list);
        }
    }

    @Nullable
    C4834q2 a(@NotNull String str);

    @NotNull
    List<C4834q2> a();

    @NotNull
    String b();

    @Nullable
    C4834q2 get(int i);

    boolean isEmpty();
}
