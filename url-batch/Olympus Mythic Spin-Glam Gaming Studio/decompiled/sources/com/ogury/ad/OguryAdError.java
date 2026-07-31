package com.ogury.ad;

import com.ogury.core.OguryError;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\u0018\u00002\u00020\u0001:\u0001\u0012B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u001a\u0010\u0007\u001a\u00020\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0013"}, d2 = {"Lcom/ogury/ad/OguryAdError;", "Lcom/ogury/core/OguryError;", "Lcom/ogury/ad/OguryAdError$Type;", "type", "", "code", "", "message", "<init>", "(Lcom/ogury/ad/OguryAdError$Type;ILjava/lang/String;)V", "a", "Lcom/ogury/ad/OguryAdError$Type;", "getType", "()Lcom/ogury/ad/OguryAdError$Type;", "b", "Ljava/lang/String;", "getMessage", "()Ljava/lang/String;", "Type", "sdk-ads_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class OguryAdError extends OguryError {

    /* renamed from: a, reason: from kotlin metadata */
    public final Type type;

    /* renamed from: b, reason: from kotlin metadata */
    public final String message;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0003\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003¨\u0006\u0004"}, d2 = {"Lcom/ogury/ad/OguryAdError$Type;", "", "LOAD_ERROR", "SHOW_ERROR", "sdk-ads_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Type {
        public static final Type LOAD_ERROR;
        public static final Type SHOW_ERROR;
        public static final /* synthetic */ Type[] a;
        public static final /* synthetic */ EnumEntries b;

        static {
            Type type = new Type(0, "LOAD_ERROR");
            LOAD_ERROR = type;
            Type type2 = new Type(1, "SHOW_ERROR");
            SHOW_ERROR = type2;
            Type[] typeArr = {type, type2};
            a = typeArr;
            b = EnumEntriesKt.enumEntries(typeArr);
        }

        public Type(int i, String str) {
        }

        @NotNull
        public static EnumEntries getEntries() {
            return b;
        }

        public static Type valueOf(String str) {
            return (Type) Enum.valueOf(Type.class, str);
        }

        public static Type[] values() {
            return (Type[]) a.clone();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OguryAdError(@NotNull Type type, int i, @NotNull String message) {
        super(i, message);
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(message, "message");
        this.type = type;
        this.message = message;
    }

    @Override // java.lang.Throwable
    @NotNull
    public String getMessage() {
        return this.message;
    }

    @NotNull
    public final Type getType() {
        return this.type;
    }
}
