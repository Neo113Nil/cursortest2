package io.intercom.android.nexus;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import javax.annotation.Nonnull;
import javax.annotation.meta.TypeQualifierDefault;

@TypeQualifierDefault({ElementType.PARAMETER, ElementType.METHOD, ElementType.FIELD})
@Nonnull
@Documented
@Retention(RetentionPolicy.SOURCE)
/* loaded from: classes8.dex */
@interface EverythingIsNonnullByDefault {
}
