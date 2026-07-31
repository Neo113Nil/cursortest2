package com.apollographql.apollo.annotations;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import kotlin.Metadata;
import kotlin.annotation.AnnotationRetention;
import kotlin.annotation.AnnotationTarget;
import kotlin.annotation.MustBeDocumented;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* compiled from: ApolloDeprecatedSince.kt */
@Target({ElementType.TYPE, ElementType.METHOD, ElementType.CONSTRUCTOR, ElementType.ANNOTATION_TYPE})
@kotlin.annotation.Target(allowedTargets = {AnnotationTarget.CLASS, AnnotationTarget.FUNCTION, AnnotationTarget.PROPERTY, AnnotationTarget.ANNOTATION_CLASS, AnnotationTarget.CONSTRUCTOR, AnnotationTarget.PROPERTY_SETTER, AnnotationTarget.PROPERTY_GETTER, AnnotationTarget.TYPEALIAS})
@Retention(RetentionPolicy.SOURCE)
@kotlin.annotation.Retention(AnnotationRetention.SOURCE)
@MustBeDocumented
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u001b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\u0002\u0018\u00002\u00020\u0001:\u0001\u0005B\b\u0012\u0006\u0010\u0002\u001a\u00020\u0003R\u000f\u0010\u0002\u001a\u00020\u0003¢\u0006\u0006\u001a\u0004\b\u0002\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/apollographql/apollo/annotations/ApolloDeprecatedSince;", "", "version", "Lcom/apollographql/apollo/annotations/ApolloDeprecatedSince$Version;", "()Lcom/apollographql/apollo/annotations/ApolloDeprecatedSince$Version;", "Version", "apollo-annotations"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Documented
/* loaded from: classes3.dex */
public @interface ApolloDeprecatedSince {
    Version version();

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: ApolloDeprecatedSince.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0016\b\u0087\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016¨\u0006\u0017"}, d2 = {"Lcom/apollographql/apollo/annotations/ApolloDeprecatedSince$Version;", "", "<init>", "(Ljava/lang/String;I)V", "v3_0_0", "v3_0_1", "v3_1_1", "v3_2_1", "v3_2_2", "v3_2_3", "v3_3_1", "v3_3_2", "v3_3_3", "v3_4_1", "v3_5_1", "v3_6_3", "v3_7_2", "v3_7_5", "v4_0_0", "v4_0_1", "v4_0_2", "v4_1_2", "v4_2_1", "apollo-annotations"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Version {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ Version[] $VALUES;
        public static final Version v3_0_0 = new Version("v3_0_0", 0);
        public static final Version v3_0_1 = new Version("v3_0_1", 1);
        public static final Version v3_1_1 = new Version("v3_1_1", 2);
        public static final Version v3_2_1 = new Version("v3_2_1", 3);
        public static final Version v3_2_2 = new Version("v3_2_2", 4);
        public static final Version v3_2_3 = new Version("v3_2_3", 5);
        public static final Version v3_3_1 = new Version("v3_3_1", 6);
        public static final Version v3_3_2 = new Version("v3_3_2", 7);
        public static final Version v3_3_3 = new Version("v3_3_3", 8);
        public static final Version v3_4_1 = new Version("v3_4_1", 9);
        public static final Version v3_5_1 = new Version("v3_5_1", 10);
        public static final Version v3_6_3 = new Version("v3_6_3", 11);
        public static final Version v3_7_2 = new Version("v3_7_2", 12);
        public static final Version v3_7_5 = new Version("v3_7_5", 13);
        public static final Version v4_0_0 = new Version("v4_0_0", 14);
        public static final Version v4_0_1 = new Version("v4_0_1", 15);
        public static final Version v4_0_2 = new Version("v4_0_2", 16);
        public static final Version v4_1_2 = new Version("v4_1_2", 17);
        public static final Version v4_2_1 = new Version("v4_2_1", 18);

        private static final /* synthetic */ Version[] $values() {
            return new Version[]{v3_0_0, v3_0_1, v3_1_1, v3_2_1, v3_2_2, v3_2_3, v3_3_1, v3_3_2, v3_3_3, v3_4_1, v3_5_1, v3_6_3, v3_7_2, v3_7_5, v4_0_0, v4_0_1, v4_0_2, v4_1_2, v4_2_1};
        }

        public static EnumEntries<Version> getEntries() {
            return $ENTRIES;
        }

        private Version(String str, int i) {
        }

        static {
            Version[] $values = $values();
            $VALUES = $values;
            $ENTRIES = EnumEntriesKt.enumEntries($values);
        }

        public static Version valueOf(String str) {
            return (Version) Enum.valueOf(Version.class, str);
        }

        public static Version[] values() {
            return (Version[]) $VALUES.clone();
        }
    }
}
