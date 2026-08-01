package com.luckycounter.drinkwater;

import S0.a;
import V0.g;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;
import androidx.lifecycle.J;
import com.luckycounter.drinkwater.AddWaterActivity;
import com.luckycounter.drinkwater.R;
import com.luckycounter.drinkwater.data.HydrationRepository;
import g.AbstractActivityC0129i;
import q1.AbstractC0352s;

/* loaded from: classes.dex */
public final class AddWaterActivity extends AbstractActivityC0129i {

    /* renamed from: A, reason: collision with root package name */
    public static final /* synthetic */ int f2466A = 0;

    /* renamed from: y, reason: collision with root package name */
    public final g f2467y = new g(new a(this, 0));

    /* renamed from: z, reason: collision with root package name */
    public HydrationRepository f2468z;

    @Override // g.AbstractActivityC0129i, a.l, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(t().f1135a);
        this.f2468z = new HydrationRepository(this);
        final int i = 0;
        t().d.setOnClickListener(new View.OnClickListener(this) { // from class: S0.b

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ AddWaterActivity f1071b;

            {
                this.f1071b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                AddWaterActivity addWaterActivity = this.f1071b;
                switch (i) {
                    case 0:
                        int i2 = AddWaterActivity.f2466A;
                        addWaterActivity.t().f1140g.setText("150");
                        break;
                    case 1:
                        int i3 = AddWaterActivity.f2466A;
                        addWaterActivity.t().f1140g.setText("250");
                        break;
                    case 2:
                        int i4 = AddWaterActivity.f2466A;
                        addWaterActivity.t().f1140g.setText("500");
                        break;
                    case 3:
                        int i5 = AddWaterActivity.f2466A;
                        addWaterActivity.finish();
                        break;
                    default:
                        int i6 = AddWaterActivity.f2466A;
                        Integer D2 = p1.k.D(addWaterActivity.t().f1140g.getText().toString());
                        if (D2 != null && D2.intValue() > 0) {
                            AbstractC0352s.g(J.e(addWaterActivity), null, new c(addWaterActivity, D2, null), 3);
                            break;
                        } else {
                            Toast.makeText(addWaterActivity, addWaterActivity.getString(R.string.amount_ml), 0).show();
                            break;
                        }
                }
            }
        });
        final int i2 = 1;
        t().f1138e.setOnClickListener(new View.OnClickListener(this) { // from class: S0.b

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ AddWaterActivity f1071b;

            {
                this.f1071b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                AddWaterActivity addWaterActivity = this.f1071b;
                switch (i2) {
                    case 0:
                        int i22 = AddWaterActivity.f2466A;
                        addWaterActivity.t().f1140g.setText("150");
                        break;
                    case 1:
                        int i3 = AddWaterActivity.f2466A;
                        addWaterActivity.t().f1140g.setText("250");
                        break;
                    case 2:
                        int i4 = AddWaterActivity.f2466A;
                        addWaterActivity.t().f1140g.setText("500");
                        break;
                    case 3:
                        int i5 = AddWaterActivity.f2466A;
                        addWaterActivity.finish();
                        break;
                    default:
                        int i6 = AddWaterActivity.f2466A;
                        Integer D2 = p1.k.D(addWaterActivity.t().f1140g.getText().toString());
                        if (D2 != null && D2.intValue() > 0) {
                            AbstractC0352s.g(J.e(addWaterActivity), null, new c(addWaterActivity, D2, null), 3);
                            break;
                        } else {
                            Toast.makeText(addWaterActivity, addWaterActivity.getString(R.string.amount_ml), 0).show();
                            break;
                        }
                }
            }
        });
        final int i3 = 2;
        t().f1139f.setOnClickListener(new View.OnClickListener(this) { // from class: S0.b

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ AddWaterActivity f1071b;

            {
                this.f1071b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                AddWaterActivity addWaterActivity = this.f1071b;
                switch (i3) {
                    case 0:
                        int i22 = AddWaterActivity.f2466A;
                        addWaterActivity.t().f1140g.setText("150");
                        break;
                    case 1:
                        int i32 = AddWaterActivity.f2466A;
                        addWaterActivity.t().f1140g.setText("250");
                        break;
                    case 2:
                        int i4 = AddWaterActivity.f2466A;
                        addWaterActivity.t().f1140g.setText("500");
                        break;
                    case 3:
                        int i5 = AddWaterActivity.f2466A;
                        addWaterActivity.finish();
                        break;
                    default:
                        int i6 = AddWaterActivity.f2466A;
                        Integer D2 = p1.k.D(addWaterActivity.t().f1140g.getText().toString());
                        if (D2 != null && D2.intValue() > 0) {
                            AbstractC0352s.g(J.e(addWaterActivity), null, new c(addWaterActivity, D2, null), 3);
                            break;
                        } else {
                            Toast.makeText(addWaterActivity, addWaterActivity.getString(R.string.amount_ml), 0).show();
                            break;
                        }
                }
            }
        });
        final int i4 = 3;
        t().f1136b.setOnClickListener(new View.OnClickListener(this) { // from class: S0.b

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ AddWaterActivity f1071b;

            {
                this.f1071b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                AddWaterActivity addWaterActivity = this.f1071b;
                switch (i4) {
                    case 0:
                        int i22 = AddWaterActivity.f2466A;
                        addWaterActivity.t().f1140g.setText("150");
                        break;
                    case 1:
                        int i32 = AddWaterActivity.f2466A;
                        addWaterActivity.t().f1140g.setText("250");
                        break;
                    case 2:
                        int i42 = AddWaterActivity.f2466A;
                        addWaterActivity.t().f1140g.setText("500");
                        break;
                    case 3:
                        int i5 = AddWaterActivity.f2466A;
                        addWaterActivity.finish();
                        break;
                    default:
                        int i6 = AddWaterActivity.f2466A;
                        Integer D2 = p1.k.D(addWaterActivity.t().f1140g.getText().toString());
                        if (D2 != null && D2.intValue() > 0) {
                            AbstractC0352s.g(J.e(addWaterActivity), null, new c(addWaterActivity, D2, null), 3);
                            break;
                        } else {
                            Toast.makeText(addWaterActivity, addWaterActivity.getString(R.string.amount_ml), 0).show();
                            break;
                        }
                }
            }
        });
        final int i5 = 4;
        t().f1137c.setOnClickListener(new View.OnClickListener(this) { // from class: S0.b

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ AddWaterActivity f1071b;

            {
                this.f1071b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                AddWaterActivity addWaterActivity = this.f1071b;
                switch (i5) {
                    case 0:
                        int i22 = AddWaterActivity.f2466A;
                        addWaterActivity.t().f1140g.setText("150");
                        break;
                    case 1:
                        int i32 = AddWaterActivity.f2466A;
                        addWaterActivity.t().f1140g.setText("250");
                        break;
                    case 2:
                        int i42 = AddWaterActivity.f2466A;
                        addWaterActivity.t().f1140g.setText("500");
                        break;
                    case 3:
                        int i52 = AddWaterActivity.f2466A;
                        addWaterActivity.finish();
                        break;
                    default:
                        int i6 = AddWaterActivity.f2466A;
                        Integer D2 = p1.k.D(addWaterActivity.t().f1140g.getText().toString());
                        if (D2 != null && D2.intValue() > 0) {
                            AbstractC0352s.g(J.e(addWaterActivity), null, new c(addWaterActivity, D2, null), 3);
                            break;
                        } else {
                            Toast.makeText(addWaterActivity, addWaterActivity.getString(R.string.amount_ml), 0).show();
                            break;
                        }
                }
            }
        });
    }

    public final T0.a t() {
        return (T0.a) this.f2467y.a();
    }
}
