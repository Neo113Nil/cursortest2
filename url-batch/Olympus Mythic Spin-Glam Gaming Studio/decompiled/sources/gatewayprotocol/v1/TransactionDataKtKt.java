package gatewayprotocol.v1;

import com.google.protobuf.Timestamp;
import gatewayprotocol.v1.TransactionDataKt;
import gatewayprotocol.v1.TransactionEventRequestOuterClass;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: TransactionDataKt.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a'\u0010\u0007\u001a\u00020\u00042\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\u0087\bø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u001a+\u0010\b\u001a\u00020\u0004*\u00020\u00042\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\u0086\bø\u0001\u0000¢\u0006\u0004\b\b\u0010\t\"\u0017\u0010\u000e\u001a\u0004\u0018\u00010\u000b*\u00020\n8F¢\u0006\u0006\u001a\u0004\b\f\u0010\r\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u000f"}, d2 = {"Lkotlin/Function1;", "Lgatewayprotocol/v1/TransactionDataKt$Dsl;", "", "block", "Lgatewayprotocol/v1/TransactionEventRequestOuterClass$TransactionData;", "-initializetransactionData", "(Lkotlin/jvm/functions/Function1;)Lgatewayprotocol/v1/TransactionEventRequestOuterClass$TransactionData;", "transactionData", "copy", "(Lgatewayprotocol/v1/TransactionEventRequestOuterClass$TransactionData;Lkotlin/jvm/functions/Function1;)Lgatewayprotocol/v1/TransactionEventRequestOuterClass$TransactionData;", "Lgatewayprotocol/v1/TransactionEventRequestOuterClass$TransactionDataOrBuilder;", "Lcom/google/protobuf/Timestamp;", "getTimestampOrNull", "(Lgatewayprotocol/v1/TransactionEventRequestOuterClass$TransactionDataOrBuilder;)Lcom/google/protobuf/Timestamp;", "timestampOrNull", "unity-ads_defaultRelease"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class TransactionDataKtKt {
    @NotNull
    /* renamed from: -initializetransactionData, reason: not valid java name */
    public static final TransactionEventRequestOuterClass.TransactionData m7519initializetransactionData(@NotNull Function1 block) {
        Intrinsics.checkNotNullParameter(block, "block");
        TransactionDataKt.Dsl.Companion companion = TransactionDataKt.Dsl.INSTANCE;
        TransactionEventRequestOuterClass.TransactionData.Builder newBuilder = TransactionEventRequestOuterClass.TransactionData.newBuilder();
        Intrinsics.checkNotNullExpressionValue(newBuilder, "newBuilder(...)");
        TransactionDataKt.Dsl _create = companion._create(newBuilder);
        block.invoke(_create);
        return _create._build();
    }

    @NotNull
    public static final TransactionEventRequestOuterClass.TransactionData copy(@NotNull TransactionEventRequestOuterClass.TransactionData transactionData, @NotNull Function1 block) {
        Intrinsics.checkNotNullParameter(transactionData, "<this>");
        Intrinsics.checkNotNullParameter(block, "block");
        TransactionDataKt.Dsl.Companion companion = TransactionDataKt.Dsl.INSTANCE;
        TransactionEventRequestOuterClass.TransactionData.Builder builder = transactionData.toBuilder();
        Intrinsics.checkNotNullExpressionValue(builder, "toBuilder(...)");
        TransactionDataKt.Dsl _create = companion._create(builder);
        block.invoke(_create);
        return _create._build();
    }

    @Nullable
    public static final Timestamp getTimestampOrNull(@NotNull TransactionEventRequestOuterClass.TransactionDataOrBuilder transactionDataOrBuilder) {
        Intrinsics.checkNotNullParameter(transactionDataOrBuilder, "<this>");
        if (transactionDataOrBuilder.hasTimestamp()) {
            return transactionDataOrBuilder.getTimestamp();
        }
        return null;
    }
}
