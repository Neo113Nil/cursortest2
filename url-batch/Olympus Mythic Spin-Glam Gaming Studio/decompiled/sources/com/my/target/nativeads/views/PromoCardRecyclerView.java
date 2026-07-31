package com.my.target.nativeads.views;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Rect;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.recyclerview.widget.RecyclerView;
import com.my.target.b6;
import com.my.target.common.models.ImageData;
import com.my.target.core.ui.views.nativeslider.CardRecyclerLayoutManager;
import com.my.target.core.ui.views.nativeslider.c;
import com.my.target.fh;
import com.my.target.ge;
import com.my.target.mi;
import com.my.target.nativeads.banners.NativePromoCard;
import com.my.target.nativeads.views.PromoCardRecyclerView;
import com.my.target.nativeads.views.PromoCardSnapHelper;
import com.my.target.nativeads.views.PromoCardView;
import com.my.target.qi;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import com.safedk.android.utils.h;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-376f9cbbf0a7df308b3ad5c16a6608bc59316f0ad6051cf26b365c8cc4cd0036 */
/* loaded from: classes14.dex */
public class PromoCardRecyclerView extends RecyclerView implements com.my.target.core.ui.views.nativeslider.c, PromoCardSnapHelper.a {
    private final CardRecyclerLayoutManager a;
    private final PromoCardSnapHelper b;
    boolean c;
    boolean d;
    private c.a e;
    private boolean f;
    private final c g;
    private int h;
    private PromoCardAdapter i;

    /* compiled from: r8-map-id-376f9cbbf0a7df308b3ad5c16a6608bc59316f0ad6051cf26b365c8cc4cd0036 */
    public static abstract class PromoCardAdapter extends RecyclerView.Adapter<PromoCardViewHolder> {
        private final List a = new ArrayList();
        private final List b = new ArrayList();
        private c c;

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void b(View view) {
            c cVar = this.c;
            if (cVar != null) {
                cVar.a(view, 2);
            }
        }

        void a(c cVar) {
            this.c = cVar;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public int getItemCount() {
            return this.a.size();
        }

        @NonNull
        public List<NativePromoCard> getNativePromoCards() {
            return this.b;
        }

        @NonNull
        public abstract PromoCardView getPromoCardView();

        @SuppressLint({"NotifyDataSetChanged"})
        public void setCards(@NonNull List<NativePromoCard> list) {
            this.a.clear();
            this.b.clear();
            for (NativePromoCard nativePromoCard : list) {
                this.a.add(new d(nativePromoCard));
                this.b.add(nativePromoCard);
            }
            notifyDataSetChanged();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void a(View view) {
            c cVar = this.c;
            if (cVar != null) {
                cVar.a(view, 1);
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        @RestrictTo
        public void onBindViewHolder(@NonNull PromoCardViewHolder promoCardViewHolder, int i) {
            PromoCardView a = promoCardViewHolder.a();
            ArrayList arrayList = new ArrayList(this.a);
            ArrayList arrayList2 = new ArrayList(this.b);
            if (i < arrayList.size() && arrayList.size() == arrayList2.size()) {
                a((NativePromoCard) arrayList2.get(i), a, (PromoCardView.Card) arrayList.get(i));
                c cVar = this.c;
                if (cVar != null) {
                    cVar.a(i);
                }
            }
            a.getView().setContentDescription("card_" + i);
            a.getView().setOnClickListener(new View.OnClickListener() { // from class: com.my.target.nativeads.views.PromoCardRecyclerView$PromoCardAdapter$$ExternalSyntheticLambda0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    PromoCardRecyclerView.PromoCardAdapter.this.a(view);
                }
            });
            a.setCtaOnClickListener(new View.OnClickListener() { // from class: com.my.target.nativeads.views.PromoCardRecyclerView$PromoCardAdapter$$ExternalSyntheticLambda1
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    PromoCardRecyclerView.PromoCardAdapter.this.b(view);
                }
            });
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        @NonNull
        @RestrictTo
        public PromoCardViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
            return new PromoCardViewHolder(getPromoCardView());
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        @RestrictTo
        public void onViewRecycled(@NonNull PromoCardViewHolder promoCardViewHolder) {
            NativePromoCard nativePromoCard;
            ImageData image;
            int layoutPosition = promoCardViewHolder.getLayoutPosition();
            PromoCardView a = promoCardViewHolder.a();
            fh fhVar = (fh) a.getMediaAdView().getImageView();
            fhVar.setImageData(null);
            if (layoutPosition > 0 && layoutPosition < this.b.size() && (nativePromoCard = (NativePromoCard) this.b.get(layoutPosition)) != null && (image = nativePromoCard.getImage()) != null) {
                b6.a(image, fhVar);
            }
            a.getView().setOnClickListener(null);
            a.setCtaOnClickListener(null);
            super.onViewRecycled((PromoCardAdapter) promoCardViewHolder);
        }

        void b() {
            Iterator it = this.b.iterator();
            while (it.hasNext()) {
                this.a.add(new d((NativePromoCard) it.next()));
            }
            notifyDataSetChanged();
        }

        void a() {
            this.a.clear();
            notifyDataSetChanged();
        }

        private void a(NativePromoCard nativePromoCard, PromoCardView promoCardView, PromoCardView.Card card) {
            if (nativePromoCard.getImage() != null) {
                promoCardView.getMediaAdView().setPlaceHolderDimension(nativePromoCard.getImage().getWidth(), nativePromoCard.getImage().getHeight());
                if (nativePromoCard.getImage().getData() != null) {
                    promoCardView.getMediaAdView().getImageView().setImageBitmap(nativePromoCard.getImage().getData());
                } else {
                    b6.b(nativePromoCard.getImage(), promoCardView.getMediaAdView().getImageView());
                }
            }
            promoCardView.setCard(card);
        }
    }

    /* compiled from: r8-map-id-376f9cbbf0a7df308b3ad5c16a6608bc59316f0ad6051cf26b365c8cc4cd0036 */
    public static class PromoCardViewHolder extends RecyclerView.ViewHolder {
        private final PromoCardView a;

        PromoCardViewHolder(PromoCardView promoCardView) {
            super(promoCardView.getView());
            promoCardView.getView().setLayoutParams(new RelativeLayout.LayoutParams(-1, -2));
            this.a = promoCardView;
        }

        PromoCardView a() {
            return this.a;
        }
    }

    /* compiled from: r8-map-id-376f9cbbf0a7df308b3ad5c16a6608bc59316f0ad6051cf26b365c8cc4cd0036 */
    class a implements c {
        a() {
        }

        @Override // com.my.target.ge
        public void a(View view, int i) {
            PromoCardRecyclerView.this.a(view, i);
        }

        @Override // com.my.target.nativeads.views.PromoCardRecyclerView.c
        public void a(int i) {
            PromoCardRecyclerView.this.a(i);
        }
    }

    /* compiled from: r8-map-id-376f9cbbf0a7df308b3ad5c16a6608bc59316f0ad6051cf26b365c8cc4cd0036 */
    class b extends RecyclerView.OnScrollListener {
        b() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
        public void onScrollStateChanged(RecyclerView recyclerView, int i) {
            super.onScrollStateChanged(recyclerView, i);
            PromoCardRecyclerView.this.d = !r2.canScrollHorizontally(1);
            PromoCardRecyclerView promoCardRecyclerView = PromoCardRecyclerView.this;
            promoCardRecyclerView.c = true ^ promoCardRecyclerView.canScrollHorizontally(-1);
        }
    }

    /* compiled from: r8-map-id-376f9cbbf0a7df308b3ad5c16a6608bc59316f0ad6051cf26b365c8cc4cd0036 */
    private interface c extends ge {
        void a(int i);
    }

    /* compiled from: r8-map-id-376f9cbbf0a7df308b3ad5c16a6608bc59316f0ad6051cf26b365c8cc4cd0036 */
    private static final class d extends PromoCardView.Card {
        private final NativePromoCard a;

        d(NativePromoCard nativePromoCard) {
            this.a = nativePromoCard;
        }

        @Override // com.my.target.nativeads.views.PromoCardView.Card
        public String getCtaButtonText() {
            return this.a.getCtaText();
        }

        @Override // com.my.target.nativeads.views.PromoCardView.Card
        public String getCurrency() {
            return this.a.getCurrency();
        }

        @Override // com.my.target.nativeads.views.PromoCardView.Card
        public String getDescription() {
            return this.a.getDescription();
        }

        @Override // com.my.target.nativeads.views.PromoCardView.Card
        public String getDiscountText() {
            return this.a.getDiscount();
        }

        @Override // com.my.target.nativeads.views.PromoCardView.Card
        public String getOldPriceText() {
            return this.a.getOldPrice();
        }

        @Override // com.my.target.nativeads.views.PromoCardView.Card
        public String getPriceText() {
            return this.a.getPrice();
        }

        @Override // com.my.target.nativeads.views.PromoCardView.Card
        public String getTitle() {
            return this.a.getTitle();
        }
    }

    /* compiled from: r8-map-id-376f9cbbf0a7df308b3ad5c16a6608bc59316f0ad6051cf26b365c8cc4cd0036 */
    private static final class e extends RecyclerView.ItemDecoration {
        private final int a;

        public e(int i) {
            this.a = i / 2;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
        public void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.State state) {
            super.getItemOffsets(rect, view, recyclerView, state);
            int childAdapterPosition = recyclerView.getChildAdapterPosition(view);
            if (state.getItemCount() == 1) {
                return;
            }
            if (childAdapterPosition == 0) {
                rect.right = this.a;
            } else {
                if (childAdapterPosition == state.getItemCount() - 1) {
                    rect.left = this.a;
                    return;
                }
                int i = this.a;
                rect.right = i;
                rect.left = i;
            }
        }
    }

    public PromoCardRecyclerView(@NonNull Context context) {
        this(context, null);
    }

    void a(View view, int i) {
        View findContainingItemView;
        if (this.f || (findContainingItemView = this.a.findContainingItemView(view)) == null) {
            return;
        }
        if (!this.a.a(findContainingItemView)) {
            smoothScrollBy(this.b.calculateDistanceToFinalSnap(this.a, findContainingItemView)[0], 0);
            return;
        }
        int position = this.a.getPosition(findContainingItemView);
        c.a aVar = this.e;
        if (aVar == null || position < 0) {
            return;
        }
        aVar.a(findContainingItemView, position, i);
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent me) {
        DetectTouchUtils.viewOnTouch(h.r, this, me);
        return super.dispatchTouchEvent(me);
    }

    @Override // com.my.target.core.ui.views.nativeslider.c
    public void dispose() {
        PromoCardAdapter promoCardAdapter = this.i;
        if (promoCardAdapter != null) {
            promoCardAdapter.a();
        }
    }

    @Override // com.my.target.core.ui.views.nativeslider.c
    @Nullable
    public Parcelable getState() {
        return this.a.onSaveInstanceState();
    }

    @Override // com.my.target.core.ui.views.nativeslider.c
    @NonNull
    public int[] getVisibleCardNumbers() {
        int findFirstVisibleItemPosition = this.a.findFirstVisibleItemPosition();
        int findLastVisibleItemPosition = this.a.findLastVisibleItemPosition();
        if (findFirstVisibleItemPosition < 0 || findLastVisibleItemPosition < 0) {
            return new int[0];
        }
        if (qi.a(this.a.findViewByPosition(findFirstVisibleItemPosition)) < 50.0f) {
            findFirstVisibleItemPosition++;
        }
        if (qi.a(this.a.findViewByPosition(findLastVisibleItemPosition)) < 50.0f) {
            findLastVisibleItemPosition--;
        }
        if (findFirstVisibleItemPosition > findLastVisibleItemPosition) {
            return new int[0];
        }
        if (findFirstVisibleItemPosition == findLastVisibleItemPosition) {
            return new int[]{findFirstVisibleItemPosition};
        }
        int i = (findLastVisibleItemPosition - findFirstVisibleItemPosition) + 1;
        int[] iArr = new int[i];
        for (int i2 = 0; i2 < i; i2++) {
            iArr[i2] = findFirstVisibleItemPosition;
            findFirstVisibleItemPosition++;
        }
        return iArr;
    }

    @Override // com.my.target.nativeads.views.PromoCardSnapHelper.a
    public boolean isReachedEnd() {
        return this.d;
    }

    @Override // com.my.target.nativeads.views.PromoCardSnapHelper.a
    public boolean isReachedStart() {
        return this.c;
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.View
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        if (1 == 0) {
            setMeasuredDimension(0, 0);
        } else {
            super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    public void onScrollStateChanged(int i) {
        super.onScrollStateChanged(i);
        boolean z = i != 0;
        this.f = z;
        if (z) {
            return;
        }
        a();
    }

    @Override // com.my.target.core.ui.views.nativeslider.c
    public void restoreState(@NonNull Parcelable parcelable) {
        PromoCardAdapter promoCardAdapter = this.i;
        if (promoCardAdapter != null) {
            promoCardAdapter.b();
        }
        this.a.onRestoreInstanceState(parcelable);
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    public void setAdapter(@Nullable RecyclerView.Adapter adapter) {
        if (adapter instanceof PromoCardAdapter) {
            setPromoCardAdapter((PromoCardAdapter) adapter);
        } else {
            mi.a("PromoCardRecyclerView: You must use setPromoCardAdapter(PromoCardAdapter) method with custom CardRecyclerView");
        }
    }

    public void setPromoCardAdapter(@Nullable PromoCardAdapter promoCardAdapter) {
        if (promoCardAdapter == null) {
            return;
        }
        this.i = promoCardAdapter;
        promoCardAdapter.a(this.g);
        this.a.a(new CardRecyclerLayoutManager.a() { // from class: com.my.target.nativeads.views.PromoCardRecyclerView$$ExternalSyntheticLambda0
            @Override // com.my.target.core.ui.views.nativeslider.CardRecyclerLayoutManager.a
            public final void a() {
                PromoCardRecyclerView.this.a();
            }
        });
        setLayoutManager(this.a);
        super.swapAdapter(this.i, true);
    }

    @Override // com.my.target.core.ui.views.nativeslider.c
    @RestrictTo
    public void setPromoCardSliderListener(@Nullable c.a aVar) {
        this.e = aVar;
    }

    public PromoCardRecyclerView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public PromoCardRecyclerView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, -1.0f, -1);
    }

    public PromoCardRecyclerView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i, float f, int i2) {
        super(context, attributeSet, i);
        this.g = new a();
        this.h = -1;
        this.a = new CardRecyclerLayoutManager(f, getContext());
        setHasFixedSize(true);
        int a2 = qi.a(i2 == -1 ? 16 : i2, context);
        PromoCardSnapHelper promoCardSnapHelper = new PromoCardSnapHelper(a2, this);
        this.b = promoCardSnapHelper;
        promoCardSnapHelper.attachToRecyclerView(this);
        addItemDecoration(new e(a2));
        addOnScrollListener(new b());
    }

    void a(int i) {
        c.a aVar = this.e;
        if (aVar != null) {
            aVar.a(i);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a() {
        int findFirstCompletelyVisibleItemPosition = this.a.findFirstCompletelyVisibleItemPosition();
        if (findFirstCompletelyVisibleItemPosition >= 0 && this.h != findFirstCompletelyVisibleItemPosition) {
            this.h = findFirstCompletelyVisibleItemPosition;
            if (this.e == null || this.a.findViewByPosition(findFirstCompletelyVisibleItemPosition) == null) {
                return;
            }
            this.e.a(new int[]{this.h}, getContext());
        }
    }
}
