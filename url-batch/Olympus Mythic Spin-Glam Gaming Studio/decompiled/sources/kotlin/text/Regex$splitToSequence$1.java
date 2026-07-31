package kotlin.text;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.sequences.SequenceScope;

/* compiled from: Regex.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\u0010\u0000\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00030\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlin/sequences/SequenceScope;", ""}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "kotlin.text.Regex$splitToSequence$1", f = "Regex.kt", l = {279, 287, 291}, m = "invokeSuspend")
/* loaded from: classes12.dex */
final class Regex$splitToSequence$1 extends RestrictedSuspendLambda implements Function2 {
    final /* synthetic */ CharSequence $input;
    final /* synthetic */ int $limit;
    int I$0;
    private /* synthetic */ Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ Regex this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    Regex$splitToSequence$1(Regex regex, CharSequence charSequence, int i, Continuation continuation) {
        super(2, continuation);
        this.this$0 = regex;
        this.$input = charSequence;
        this.$limit = i;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        Regex$splitToSequence$1 regex$splitToSequence$1 = new Regex$splitToSequence$1(this.this$0, this.$input, this.$limit, continuation);
        regex$splitToSequence$1.L$0 = obj;
        return regex$splitToSequence$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(SequenceScope sequenceScope, Continuation continuation) {
        return ((Regex$splitToSequence$1) create(sequenceScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0070 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x009c A[RETURN] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:18:0x006e -> B:13:0x0071). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Pattern pattern;
        SequenceScope sequenceScope;
        Matcher matcher;
        int i;
        String obj2;
        String obj3;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = this.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(obj);
            SequenceScope sequenceScope2 = (SequenceScope) this.L$0;
            pattern = this.this$0.nativePattern;
            Matcher matcher2 = pattern.matcher(this.$input);
            if (this.$limit == 1 || !matcher2.find()) {
                String obj4 = this.$input.toString();
                this.label = 1;
                if (sequenceScope2.yield(obj4, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                int i3 = 0;
                sequenceScope = sequenceScope2;
                matcher = matcher2;
                i = 0;
                obj2 = this.$input.subSequence(i3, matcher.start()).toString();
                this.L$0 = sequenceScope;
                this.L$1 = matcher;
                this.I$0 = i;
                this.label = 2;
                if (sequenceScope.yield(obj2, this) == coroutine_suspended) {
                }
                i3 = matcher.end();
                i++;
                if (i != this.$limit - 1) {
                }
                CharSequence charSequence = this.$input;
                obj3 = charSequence.subSequence(i3, charSequence.length()).toString();
                this.L$0 = null;
                this.L$1 = null;
                this.label = 3;
                if (sequenceScope.yield(obj3, this) == coroutine_suspended) {
                }
                return Unit.INSTANCE;
            }
        } else {
            if (i2 != 1) {
                if (i2 != 2) {
                    if (i2 != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    return Unit.INSTANCE;
                }
                i = this.I$0;
                Matcher matcher3 = (Matcher) this.L$1;
                sequenceScope = (SequenceScope) this.L$0;
                ResultKt.throwOnFailure(obj);
                matcher = matcher3;
                i3 = matcher.end();
                i++;
                if (i != this.$limit - 1 || !matcher.find()) {
                    CharSequence charSequence2 = this.$input;
                    obj3 = charSequence2.subSequence(i3, charSequence2.length()).toString();
                    this.L$0 = null;
                    this.L$1 = null;
                    this.label = 3;
                    if (sequenceScope.yield(obj3, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    return Unit.INSTANCE;
                }
                obj2 = this.$input.subSequence(i3, matcher.start()).toString();
                this.L$0 = sequenceScope;
                this.L$1 = matcher;
                this.I$0 = i;
                this.label = 2;
                if (sequenceScope.yield(obj2, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                i3 = matcher.end();
                i++;
                if (i != this.$limit - 1) {
                }
                CharSequence charSequence22 = this.$input;
                obj3 = charSequence22.subSequence(i3, charSequence22.length()).toString();
                this.L$0 = null;
                this.L$1 = null;
                this.label = 3;
                if (sequenceScope.yield(obj3, this) == coroutine_suspended) {
                }
                return Unit.INSTANCE;
            }
            ResultKt.throwOnFailure(obj);
        }
        return Unit.INSTANCE;
    }
}
