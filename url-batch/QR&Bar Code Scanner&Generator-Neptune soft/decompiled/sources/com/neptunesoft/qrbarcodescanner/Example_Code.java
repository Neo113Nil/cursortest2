package com.neptunesoft.qrbarcodescanner;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

/* loaded from: classes2.dex */
public class Example_Code extends AppCompatActivity {
    static int index;
    String link;

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_example__code);
        TextView textView = (TextView) findViewById(R.id.txtvtitle_example);
        TextView textView2 = (TextView) findViewById(R.id.txtv_exemple);
        ImageView imageView = (ImageView) findViewById(R.id.imageView_qr_exemple);
        ImageView imageView2 = (ImageView) findViewById(R.id.imgv_btn_link);
        TextView textView3 = (TextView) findViewById(R.id.txtv_btn_link);
        switch (index) {
            case 1:
                textView.setText("CodaBar");
                this.link = "https://en.wikipedia.org/wiki/Codabar";
                imageView.setImageResource(R.drawable.codabar);
                imageView2.setImageResource(R.drawable.wikipedia);
                textView3.setText("Wikipedia");
                textView2.setText("Example : '31117013206375'");
                break;
            case 2:
                textView.setText("Aztec Code");
                this.link = "https://en.wikipedia.org/wiki/Aztec_Code";
                imageView.setImageResource(R.drawable.azteccode);
                imageView2.setImageResource(R.drawable.wikipedia);
                textView3.setText("Wikipedia");
                textView2.setText("Example : 'This is an example Aztec symbol for Wikipedia.'");
                break;
            case 3:
                textView.setText("Code 39");
                this.link = "https://en.wikipedia.org/wiki/Code_39";
                imageView2.setImageResource(R.drawable.wikipedia);
                textView3.setText("Wikipedia");
                imageView.setImageResource(R.drawable.code_39);
                textView2.setText("Example : 'WIKIPEDIA'");
                break;
            case 4:
                textView.setText("Code 93");
                this.link = "https://en.wikipedia.org/wiki/Code_93";
                imageView2.setImageResource(R.drawable.wikipedia);
                textView3.setText("Wikipedia");
                imageView.setImageResource(R.drawable.code_93);
                textView2.setText("Example : 'WIKIPEDIA'");
                break;
            case 5:
                textView.setText("Code 128");
                this.link = "https://en.wikipedia.org/wiki/Code_128";
                imageView2.setImageResource(R.drawable.wikipedia);
                textView3.setText("Wikipedia");
                imageView.setImageResource(R.drawable.code_128);
                textView2.setText("Example : 'Wikipedia'");
                break;
            case 6:
                textView.setText("Data matrix");
                this.link = "https://en.wikipedia.org/wiki/Data_Matrix";
                imageView2.setImageResource(R.drawable.wikipedia);
                textView3.setText("Wikipedia");
                imageView.setImageResource(R.drawable.datamatrix);
                textView2.setText("Example : 'Wikipedia, the free encyclopedia'");
                break;
            case 7:
                textView.setText("EAN 8");
                this.link = "https://en.wikipedia.org/wiki/EAN-8";
                imageView2.setImageResource(R.drawable.wikipedia);
                textView3.setText("Wikipedia");
                imageView.setImageResource(R.drawable.ean8);
                textView2.setText("Example : '96385074");
                break;
            case 8:
                textView.setText("EAN 13");
                this.link = "https://fr.wikipedia.org/wiki/EAN_13";
                imageView2.setImageResource(R.drawable.wikipedia);
                textView3.setText("Wikipedia");
                imageView.setImageResource(R.drawable.ean13);
                textView2.setText("Example : '1234567890128");
                break;
            case 9:
                textView.setText("ITF 14");
                this.link = "https://en.wikipedia.org/wiki/ITF-14";
                imageView2.setImageResource(R.drawable.wikipedia);
                textView3.setText("Wikipedia");
                imageView.setImageResource(R.drawable.itf14);
                textView2.setText("Example : '98765432109213'");
                break;
            case 10:
                textView.setText("PDF 417");
                this.link = "https://en.wikipedia.org/wiki/PDF417";
                imageView2.setImageResource(R.drawable.wikipedia);
                textView3.setText("Wikipedia");
                imageView.setImageResource(R.drawable.pdf417);
                textView2.setText("Example : 'Wikipedia'");
                break;
            case 11:
                textView.setText("RSS 14");
                this.link = "https://www.technoriversoft.com/RSS14Barcode.html";
                imageView2.setImageResource(R.drawable.website);
                textView3.setText("more information");
                imageView.setImageResource(R.drawable.rss14);
                textView2.setText("Example : '20012345678909'");
                break;
            case 12:
                textView.setText("RSS Expanded");
                this.link = "https://www.neodynamic.com/Products/Help/BarcodeWP1.0/barcodes/GS1DataBarExpanded.htm";
                imageView2.setImageResource(R.drawable.website);
                textView3.setText("more information");
                imageView.setImageResource(R.drawable.rssexpanded);
                textView2.setText("Example : '(01)90614141000015(3202)000150'");
                break;
            case 13:
                textView.setText("UPC A");
                this.link = "https://en.wikipedia.org/?title=UPC-A&redirect=no";
                imageView2.setImageResource(R.drawable.wikipedia);
                textView3.setText("Wikipedia");
                imageView.setImageResource(R.drawable.upc_a);
                textView2.setText("Example : '036000291452'");
                break;
            case 14:
                textView.setText("UPC E");
                this.link = "https://en.wikipedia.org/?title=UPC-E&redirect=no";
                imageView2.setImageResource(R.drawable.wikipedia);
                textView3.setText("Wikipedia");
                imageView.setImageResource(R.drawable.upc_e);
                textView2.setText("Example : '06543217'");
                break;
            default:
                textView.setText("QR code");
                this.link = "https://en.wikipedia.org/wiki/QR_code";
                imageView2.setImageResource(R.drawable.wikipedia);
                textView3.setText("Wikipedia");
                imageView.setImageResource(R.drawable.qrcode);
                textView2.setText("Example : 'http://en.m.wikipedia.org'");
                break;
        }
        final CardView cardView = (CardView) findViewById(R.id.cv_wikipedia);
        cardView.setCardElevation(10.0f);
        cardView.setOnTouchListener(new View.OnTouchListener() { // from class: com.neptunesoft.qrbarcodescanner.Example_Code$$ExternalSyntheticLambda1
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                return Example_Code.this.m134lambda$onCreate$0$comneptunesoftqrbarcodescannerExample_Code(cardView, view, motionEvent);
            }
        });
        cardView.setOnClickListener(new View.OnClickListener() { // from class: com.neptunesoft.qrbarcodescanner.Example_Code$$ExternalSyntheticLambda0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                Example_Code.this.m135lambda$onCreate$1$comneptunesoftqrbarcodescannerExample_Code(view);
            }
        });
    }

    /* renamed from: lambda$onCreate$0$com-neptunesoft-qrbarcodescanner-Example_Code, reason: not valid java name */
    /* synthetic */ boolean m134lambda$onCreate$0$comneptunesoftqrbarcodescannerExample_Code(CardView cardView, View view, MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action == 0) {
            cardView.setCardElevation(0.0f);
            cardView.setCardBackgroundColor(getColor(R.color.raisin_blackdark));
        } else if (action == 1) {
            cardView.setCardElevation(10.0f);
            cardView.setCardBackgroundColor(getColor(R.color.raisin_black));
            float x = motionEvent.getX();
            float y = motionEvent.getY();
            int width = cardView.getWidth();
            int height = cardView.getHeight();
            if (x > 0.0f && x < width && y > 0.0f && y < height) {
                cardView.callOnClick();
            }
        }
        return true;
    }

    /* renamed from: lambda$onCreate$1$com-neptunesoft-qrbarcodescanner-Example_Code, reason: not valid java name */
    /* synthetic */ void m135lambda$onCreate$1$comneptunesoftqrbarcodescannerExample_Code(View view) {
        try {
            startActivity(new Intent("android.intent.action.VIEW", Uri.parse(this.link)));
        } catch (ActivityNotFoundException unused) {
            Toast.makeText(getApplicationContext(), "Install any browser to be able to open the website link", 0).show();
        }
    }
}
