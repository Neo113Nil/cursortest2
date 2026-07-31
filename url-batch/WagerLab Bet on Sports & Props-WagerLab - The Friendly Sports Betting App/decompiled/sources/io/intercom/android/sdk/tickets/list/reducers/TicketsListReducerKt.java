package io.intercom.android.sdk.tickets.list.reducers;

import androidx.compose.runtime.Composer;
import androidx.compose.ui.res.StringResources_androidKt;
import androidx.paging.LoadState;
import androidx.paging.compose.LazyPagingItems;
import io.intercom.android.sdk.Injector;
import io.intercom.android.sdk.R;
import io.intercom.android.sdk.identity.AppConfig;
import io.intercom.android.sdk.m5.components.ErrorState;
import io.intercom.android.sdk.models.EmptyState;
import io.intercom.android.sdk.models.Space;
import io.intercom.android.sdk.tickets.list.data.TicketsScreenUiState;
import io.intercom.android.sdk.tickets.list.ui.TicketRowData;
import java.io.IOException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: TicketsListReducer.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a'\u0010\u0000\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00030\u00022\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u0001¢\u0006\u0002\u0010\u0007¨\u0006\b"}, d2 = {"reduceToTicketsScreenUiState", "Lio/intercom/android/sdk/tickets/list/data/TicketsScreenUiState;", "Landroidx/paging/compose/LazyPagingItems;", "Lio/intercom/android/sdk/tickets/list/ui/TicketRowData;", "config", "Lkotlin/Function0;", "Lio/intercom/android/sdk/identity/AppConfig;", "(Landroidx/paging/compose/LazyPagingItems;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)Lio/intercom/android/sdk/tickets/list/data/TicketsScreenUiState;", "intercom-sdk-base_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class TicketsListReducerKt {
    public static final TicketsScreenUiState reduceToTicketsScreenUiState(final LazyPagingItems<TicketRowData> lazyPagingItems, Function0<AppConfig> function0, Composer composer, int i, int i2) {
        TicketsScreenUiState.Empty initial;
        TicketsScreenUiState.Error error;
        Intrinsics.checkNotNullParameter(lazyPagingItems, "<this>");
        composer.startReplaceGroup(-356015290);
        if ((i2 & 1) != 0) {
            function0 = new Function0() { // from class: io.intercom.android.sdk.tickets.list.reducers.TicketsListReducerKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    AppConfig reduceToTicketsScreenUiState$lambda$0;
                    reduceToTicketsScreenUiState$lambda$0 = TicketsListReducerKt.reduceToTicketsScreenUiState$lambda$0();
                    return reduceToTicketsScreenUiState$lambda$0;
                }
            };
        }
        String spaceLabelIfExists = function0.invoke().getSpaceLabelIfExists(Space.Type.TICKETS);
        composer.startReplaceGroup(-374395883);
        if (spaceLabelIfExists == null) {
            spaceLabelIfExists = StringResources_androidKt.stringResource(R.string.intercom_tickets_space_title, composer, 0);
        }
        composer.endReplaceGroup();
        if (lazyPagingItems.getItemSnapshotList().size() != 0) {
            boolean z = lazyPagingItems.getLoadState().getAppend() instanceof LoadState.Loading;
            LoadState append = lazyPagingItems.getLoadState().getAppend();
            ErrorState.WithoutCTA withoutCTA = null;
            LoadState.Error error2 = append instanceof LoadState.Error ? (LoadState.Error) append : null;
            if (error2 != null) {
                withoutCTA = error2.getError() instanceof IOException ? new ErrorState.WithCTA(0, 0, null, 0, new Function0() { // from class: io.intercom.android.sdk.tickets.list.reducers.TicketsListReducerKt$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        Unit reduceToTicketsScreenUiState$lambda$2$lambda$1;
                        reduceToTicketsScreenUiState$lambda$2$lambda$1 = TicketsListReducerKt.reduceToTicketsScreenUiState$lambda$2$lambda$1(LazyPagingItems.this);
                        return reduceToTicketsScreenUiState$lambda$2$lambda$1;
                    }
                }, 15, null) : new ErrorState.WithoutCTA(0, 0, null, 7, null);
            }
            initial = new TicketsScreenUiState.Content(lazyPagingItems, z, withoutCTA, spaceLabelIfExists);
        } else if (lazyPagingItems.getLoadState().getRefresh() instanceof LoadState.Error) {
            LoadState refresh = lazyPagingItems.getLoadState().getRefresh();
            Intrinsics.checkNotNull(refresh, "null cannot be cast to non-null type androidx.paging.LoadState.Error");
            if (((LoadState.Error) refresh).getError() instanceof IOException) {
                error = new TicketsScreenUiState.Error(new ErrorState.WithCTA(0, 0, Integer.valueOf(R.string.intercom_failed_to_load_tickets), 0, new Function0() { // from class: io.intercom.android.sdk.tickets.list.reducers.TicketsListReducerKt$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        Unit reduceToTicketsScreenUiState$lambda$3;
                        reduceToTicketsScreenUiState$lambda$3 = TicketsListReducerKt.reduceToTicketsScreenUiState$lambda$3(LazyPagingItems.this);
                        return reduceToTicketsScreenUiState$lambda$3;
                    }
                }, 11, null), spaceLabelIfExists);
            } else {
                error = new TicketsScreenUiState.Error(new ErrorState.WithoutCTA(0, 0, Integer.valueOf(R.string.intercom_failed_to_load_tickets), 3, null), spaceLabelIfExists);
            }
            initial = error;
        } else {
            initial = lazyPagingItems.getLoadState().getRefresh() instanceof LoadState.Loading ? new TicketsScreenUiState.Initial(spaceLabelIfExists) : new TicketsScreenUiState.Empty(new EmptyState(StringResources_androidKt.stringResource(R.string.intercom_tickets_empty_state_title, composer, 0), StringResources_androidKt.stringResource(R.string.intercom_tickets_empty_state_text, composer, 0), null, 4, null), spaceLabelIfExists);
        }
        composer.endReplaceGroup();
        return initial;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final AppConfig reduceToTicketsScreenUiState$lambda$0() {
        return Injector.get().getAppConfigProvider().get();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit reduceToTicketsScreenUiState$lambda$2$lambda$1(LazyPagingItems this_reduceToTicketsScreenUiState) {
        Intrinsics.checkNotNullParameter(this_reduceToTicketsScreenUiState, "$this_reduceToTicketsScreenUiState");
        this_reduceToTicketsScreenUiState.retry();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit reduceToTicketsScreenUiState$lambda$3(LazyPagingItems this_reduceToTicketsScreenUiState) {
        Intrinsics.checkNotNullParameter(this_reduceToTicketsScreenUiState, "$this_reduceToTicketsScreenUiState");
        this_reduceToTicketsScreenUiState.refresh();
        return Unit.INSTANCE;
    }
}
