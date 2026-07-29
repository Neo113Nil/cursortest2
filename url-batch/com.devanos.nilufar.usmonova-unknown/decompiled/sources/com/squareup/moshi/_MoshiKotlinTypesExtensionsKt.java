package com.squareup.moshi;

import java.lang.annotation.Annotation;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;
import java.util.Set;
import kotlin.Metadata;
import o.AbstractC0048Bt;
import o.AbstractC1473m3;
import o.InterfaceC0517Tv;
import o.InterfaceC1463lx;
import o.PX;

@Metadata(d1 = {"\u00006\n\u0002\u0010\u001b\n\u0000\n\u0002\u0010\"\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a.\u0010\u0003\u001a\n\u0012\u0004\u0012\u00020\u0000\u0018\u00010\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000*\b\u0012\u0004\u0012\u00020\u00000\u0002H\u0086\b¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u0018\u0010\u0006\u001a\u00020\u0005\"\u0006\b\u0000\u0010\u0001\u0018\u0001H\u0087\b¢\u0006\u0004\b\u0006\u0010\u0007\u001a\u0018\u0010\b\u001a\u00020\u0005\"\u0006\b\u0000\u0010\u0001\u0018\u0001H\u0087\b¢\u0006\u0004\b\b\u0010\u0007\u001a\u0013\u0010\u000b\u001a\u00020\n*\u00020\tH\u0007¢\u0006\u0004\b\u000b\u0010\f\u001a\u0015\u0010\u000b\u001a\u00020\n*\u0006\u0012\u0002\b\u00030\r¢\u0006\u0004\b\u000b\u0010\u000e\u001a\u0011\u0010\u000b\u001a\u00020\n*\u00020\u000f¢\u0006\u0004\b\u000b\u0010\u0010\"\u0019\u0010\u0014\u001a\u0006\u0012\u0002\b\u00030\u0011*\u00020\u000f8F¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0015"}, d2 = {"", "T", "", "nextAnnotations", "(Ljava/util/Set;)Ljava/util/Set;", "Ljava/lang/reflect/WildcardType;", "subtypeOf", "()Ljava/lang/reflect/WildcardType;", "supertypeOf", "Lo/lx;", "Ljava/lang/reflect/GenericArrayType;", "asArrayType", "(Lo/lx;)Ljava/lang/reflect/GenericArrayType;", "Lo/Tv;", "(Lo/Tv;)Ljava/lang/reflect/GenericArrayType;", "Ljava/lang/reflect/Type;", "(Ljava/lang/reflect/Type;)Ljava/lang/reflect/GenericArrayType;", "Ljava/lang/Class;", "getRawType", "(Ljava/lang/reflect/Type;)Ljava/lang/Class;", "rawType", "moshi"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class _MoshiKotlinTypesExtensionsKt {
    public static final GenericArrayType asArrayType(InterfaceC1463lx interfaceC1463lx) {
        AbstractC0048Bt.n(interfaceC1463lx, "<this>");
        return asArrayType(PX.P(interfaceC1463lx));
    }

    public static final Class<?> getRawType(Type type) {
        AbstractC0048Bt.n(type, "<this>");
        Class<?> rawType = Types.getRawType(type);
        AbstractC0048Bt.m(rawType, "getRawType(this)");
        return rawType;
    }

    public static final <T extends Annotation> Set<Annotation> nextAnnotations(Set<? extends Annotation> set) {
        AbstractC0048Bt.n(set, "<this>");
        AbstractC0048Bt.h0();
        throw null;
    }

    public static final <T> WildcardType subtypeOf() {
        AbstractC0048Bt.h0();
        throw null;
    }

    public static final <T> WildcardType supertypeOf() {
        AbstractC0048Bt.h0();
        throw null;
    }

    public static final GenericArrayType asArrayType(InterfaceC0517Tv interfaceC0517Tv) {
        AbstractC0048Bt.n(interfaceC0517Tv, "<this>");
        return asArrayType(AbstractC1473m3.D(interfaceC0517Tv));
    }

    public static final GenericArrayType asArrayType(Type type) {
        AbstractC0048Bt.n(type, "<this>");
        GenericArrayType arrayOf = Types.arrayOf(type);
        AbstractC0048Bt.m(arrayOf, "arrayOf(this)");
        return arrayOf;
    }
}
