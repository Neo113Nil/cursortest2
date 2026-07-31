package com.yandex.div.internal.parser;

import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;

/* compiled from: TypeHelpers.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\bf\u0018\u0000 \t*\u0004\b\u0000\u0010\u00012\u00020\u0002:\u0001\tJ\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0002H&R\u0012\u0010\u0003\u001a\u00028\u0000X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\nÀ\u0006\u0001"}, d2 = {"Lcom/yandex/div/internal/parser/TypeHelper;", "T", "", "typeDefault", "getTypeDefault", "()Ljava/lang/Object;", "isTypeValid", "", "value", "Companion", "div-data_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes3.dex */
public interface TypeHelper<T> {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = Companion.$$INSTANCE;

    T getTypeDefault();

    boolean isTypeValid(@NotNull Object value);

    /* compiled from: TypeHelpers.kt */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J7\u0010\u0003\u001a\b\u0012\u0004\u0012\u0002H\u00050\u0004\"\b\b\u0001\u0010\u0005*\u00020\u00012\u0006\u0010\u0006\u001a\u0002H\u00052\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\t0\b¢\u0006\u0002\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/yandex/div/internal/parser/TypeHelper$Companion;", "", "()V", "from", "Lcom/yandex/div/internal/parser/TypeHelper;", "T", "default", "validator", "Lkotlin/Function1;", "", "(Ljava/lang/Object;Lkotlin/jvm/functions/Function1;)Lcom/yandex/div/internal/parser/TypeHelper;", "div-data_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        private Companion() {
        }

        @NotNull
        public final <T> TypeHelper<T> from(@NotNull final T r2, @NotNull final Function1 validator) {
            return new TypeHelper<T>(r2, validator) { // from class: com.yandex.div.internal.parser.TypeHelper$Companion$from$1
                final /* synthetic */ Function1 $validator;

                @NotNull
                private final T typeDefault;

                {
                    this.$validator = validator;
                    this.typeDefault = r2;
                }

                @Override // com.yandex.div.internal.parser.TypeHelper
                @NotNull
                public T getTypeDefault() {
                    return this.typeDefault;
                }

                @Override // com.yandex.div.internal.parser.TypeHelper
                public boolean isTypeValid(@NotNull Object value) {
                    return ((Boolean) this.$validator.invoke(value)).booleanValue();
                }
            };
        }
    }
}
