package o;

import android.content.ClipData;
import android.content.ClipDescription;
import android.content.ClipboardManager;
import android.content.Context;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.text.DynamicLayout;
import android.text.Editable;
import android.text.Layout;
import android.text.Selection;
import android.text.TextPaint;
import android.view.KeyEvent;
import android.view.inputmethod.BaseInputConnection;
import android.view.inputmethod.CursorAnchorInfo;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.ExtractedText;
import android.view.inputmethod.ExtractedTextRequest;
import android.view.inputmethod.InputContentInfo;
import android.view.inputmethod.InputMethodManager;
import com.google.firebase.messaging.Constants;
import io.flutter.embedding.engine.FlutterJNI;
import java.io.ByteArrayOutputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;
import java.util.HashMap;

/* renamed from: o.Ps, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0410Ps extends BaseInputConnection implements InterfaceC2007uA {
    public final C0068Cn a;
    public final int b;
    public final C0208Hx c;
    public final C2073vA d;
    public final EditorInfo e;
    public ExtractedTextRequest f;
    public boolean g;
    public CursorAnchorInfo.Builder h;
    public final ExtractedText i;
    public final InputMethodManager j;
    public final DynamicLayout k;
    public final Y1 l;
    public final C0950e6 m;
    public int n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0410Ps(C0068Cn c0068Cn, int i, C0208Hx c0208Hx, C0950e6 c0950e6, C2073vA c2073vA, EditorInfo editorInfo) {
        super(c0068Cn, true);
        FlutterJNI flutterJNI = new FlutterJNI();
        this.g = false;
        this.i = new ExtractedText();
        this.n = 0;
        this.a = c0068Cn;
        this.b = i;
        this.c = c0208Hx;
        this.d = c2073vA;
        c2073vA.a(this);
        this.e = editorInfo;
        this.m = c0950e6;
        this.l = new Y1(28, flutterJNI);
        this.k = new DynamicLayout(c2073vA, new TextPaint(), Integer.MAX_VALUE, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
        this.j = (InputMethodManager) c0068Cn.getContext().getSystemService("input_method");
    }

    @Override // o.InterfaceC2007uA
    public final void a(boolean z) {
        C2073vA c2073vA = this.d;
        c2073vA.getClass();
        int selectionStart = Selection.getSelectionStart(c2073vA);
        int selectionEnd = Selection.getSelectionEnd(c2073vA);
        int composingSpanStart = BaseInputConnection.getComposingSpanStart(c2073vA);
        int composingSpanEnd = BaseInputConnection.getComposingSpanEnd(c2073vA);
        InputMethodManager inputMethodManager = this.j;
        C0068Cn c0068Cn = this.a;
        inputMethodManager.updateSelection(c0068Cn, selectionStart, selectionEnd, composingSpanStart, composingSpanEnd);
        ExtractedTextRequest extractedTextRequest = this.f;
        if (extractedTextRequest != null) {
            inputMethodManager.updateExtractedText(c0068Cn, extractedTextRequest.token, c(extractedTextRequest));
        }
        if (this.g) {
            inputMethodManager.updateCursorAnchorInfo(c0068Cn, b());
        }
    }

    public final CursorAnchorInfo b() {
        CursorAnchorInfo.Builder builder = this.h;
        if (builder == null) {
            this.h = new CursorAnchorInfo.Builder();
        } else {
            builder.reset();
        }
        CursorAnchorInfo.Builder builder2 = this.h;
        C2073vA c2073vA = this.d;
        c2073vA.getClass();
        int selectionStart = Selection.getSelectionStart(c2073vA);
        c2073vA.getClass();
        builder2.setSelectionRange(selectionStart, Selection.getSelectionEnd(c2073vA));
        c2073vA.getClass();
        int composingSpanStart = BaseInputConnection.getComposingSpanStart(c2073vA);
        c2073vA.getClass();
        int composingSpanEnd = BaseInputConnection.getComposingSpanEnd(c2073vA);
        if (composingSpanStart < 0 || composingSpanEnd <= composingSpanStart) {
            this.h.setComposingText(-1, "");
        } else {
            this.h.setComposingText(composingSpanStart, c2073vA.toString().subSequence(composingSpanStart, composingSpanEnd));
        }
        return this.h.build();
    }

    @Override // android.view.inputmethod.BaseInputConnection, android.view.inputmethod.InputConnection
    public final boolean beginBatchEdit() {
        this.d.b();
        this.n++;
        return super.beginBatchEdit();
    }

    public final ExtractedText c(ExtractedTextRequest extractedTextRequest) {
        ExtractedText extractedText = this.i;
        extractedText.startOffset = 0;
        extractedText.partialStartOffset = -1;
        extractedText.partialEndOffset = -1;
        CharSequence charSequence = this.d;
        charSequence.getClass();
        extractedText.selectionStart = Selection.getSelectionStart(charSequence);
        charSequence.getClass();
        extractedText.selectionEnd = Selection.getSelectionEnd(charSequence);
        if (extractedTextRequest == null || (extractedTextRequest.flags & 1) == 0) {
            charSequence = charSequence.toString();
        }
        extractedText.text = charSequence;
        return extractedText;
    }

    @Override // android.view.inputmethod.BaseInputConnection, android.view.inputmethod.InputConnection
    public final void closeConnection() {
        super.closeConnection();
        this.d.e(this);
        while (this.n > 0) {
            endBatchEdit();
            this.n--;
        }
    }

    @Override // android.view.inputmethod.BaseInputConnection, android.view.inputmethod.InputConnection
    public final boolean commitContent(InputContentInfo inputContentInfo, int i, Bundle bundle) {
        ClipDescription description;
        Uri contentUri;
        ClipDescription description2;
        int i2;
        if (Build.VERSION.SDK_INT >= 25 && (i & 1) != 0) {
            try {
                inputContentInfo.requestPermission();
                description = inputContentInfo.getDescription();
                if (description.getMimeTypeCount() > 0) {
                    inputContentInfo.requestPermission();
                    contentUri = inputContentInfo.getContentUri();
                    description2 = inputContentInfo.getDescription();
                    String mimeType = description2.getMimeType(0);
                    Context context = this.a.getContext();
                    if (contentUri != null) {
                        try {
                            InputStream openInputStream = context.getContentResolver().openInputStream(contentUri);
                            if (openInputStream != null) {
                                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                                byte[] bArr = new byte[65536];
                                while (true) {
                                    try {
                                        i2 = openInputStream.read(bArr);
                                    } catch (IOException unused) {
                                        i2 = -1;
                                    }
                                    if (i2 == -1) {
                                        byte[] byteArray = byteArrayOutputStream.toByteArray();
                                        HashMap hashMap = new HashMap();
                                        hashMap.put("mimeType", mimeType);
                                        hashMap.put(Constants.ScionAnalytics.MessageType.DATA_MESSAGE, byteArray);
                                        hashMap.put("uri", contentUri.toString());
                                        ((C0950e6) this.c.i).E("TextInputClient.performAction", Arrays.asList(Integer.valueOf(this.b), "TextInputAction.commitContent", hashMap), null);
                                        inputContentInfo.releasePermission();
                                        return true;
                                    }
                                    byteArrayOutputStream.write(bArr, 0, i2);
                                }
                            }
                        } catch (FileNotFoundException unused2) {
                            inputContentInfo.releasePermission();
                            return false;
                        }
                    }
                    inputContentInfo.releasePermission();
                }
            } catch (Exception unused3) {
            }
        }
        return false;
    }

    public final boolean d(boolean z, boolean z2) {
        int charCount;
        int charCount2;
        int charCount3;
        int charCount4;
        int min;
        int codePointBefore;
        int charCount5;
        int charCount6;
        int i;
        int i2;
        int charCount7;
        C2073vA c2073vA = this.d;
        int selectionStart = Selection.getSelectionStart(c2073vA);
        int selectionEnd = Selection.getSelectionEnd(c2073vA);
        int i3 = 0;
        if (selectionStart < 0 || selectionEnd < 0) {
            return false;
        }
        Y1 y1 = this.l;
        if (z) {
            FlutterJNI flutterJNI = (FlutterJNI) y1.i;
            if (selectionEnd > 1 && (charCount6 = selectionEnd - (charCount5 = Character.charCount((codePointBefore = Character.codePointBefore(c2073vA, selectionEnd))))) != 0) {
                if (codePointBefore == 10) {
                    if (Character.codePointBefore(c2073vA, charCount6) == 13) {
                        charCount5++;
                    }
                } else if (flutterJNI.isCodePointRegionalIndicator(codePointBefore)) {
                    int codePointBefore2 = Character.codePointBefore(c2073vA, charCount6);
                    int charCount8 = charCount6 - Character.charCount(codePointBefore2);
                    int i4 = 1;
                    while (charCount8 > 0 && flutterJNI.isCodePointRegionalIndicator(codePointBefore2)) {
                        codePointBefore2 = Character.codePointBefore(c2073vA, charCount8);
                        charCount8 -= Character.charCount(codePointBefore2);
                        i4++;
                    }
                    if (i4 % 2 == 0) {
                        charCount5 += 2;
                    }
                } else if (codePointBefore == 8419) {
                    int codePointBefore3 = Character.codePointBefore(c2073vA, charCount6);
                    int charCount9 = charCount6 - Character.charCount(codePointBefore3);
                    if (charCount9 > 0 && flutterJNI.isCodePointVariantSelector(codePointBefore3)) {
                        int codePointBefore4 = Character.codePointBefore(c2073vA, charCount9);
                        if (Y1.a0(codePointBefore4)) {
                            charCount7 = Character.charCount(codePointBefore4) + Character.charCount(codePointBefore3);
                            charCount5 += charCount7;
                        }
                    } else if (Y1.a0(codePointBefore3)) {
                        charCount7 = Character.charCount(codePointBefore3);
                        charCount5 += charCount7;
                    }
                } else {
                    if (codePointBefore == 917631) {
                        int codePointBefore5 = Character.codePointBefore(c2073vA, charCount6);
                        charCount6 -= Character.charCount(codePointBefore5);
                        codePointBefore = codePointBefore5;
                        while (charCount6 > 0 && 917536 <= codePointBefore && codePointBefore <= 917630) {
                            charCount5 += Character.charCount(codePointBefore);
                            codePointBefore = Character.codePointBefore(c2073vA, charCount6);
                            charCount6 -= Character.charCount(codePointBefore);
                        }
                        if (flutterJNI.isCodePointEmoji(codePointBefore)) {
                            charCount5 += Character.charCount(codePointBefore);
                        } else {
                            i2 = selectionEnd - 2;
                        }
                    }
                    if (flutterJNI.isCodePointVariantSelector(codePointBefore)) {
                        codePointBefore = Character.codePointBefore(c2073vA, charCount6);
                        if (flutterJNI.isCodePointEmoji(codePointBefore)) {
                            charCount5 += Character.charCount(codePointBefore);
                            charCount6 -= charCount5;
                        }
                    }
                    if (flutterJNI.isCodePointEmoji(codePointBefore)) {
                        boolean z3 = false;
                        int i5 = 0;
                        while (true) {
                            if (z3) {
                                charCount5 = Character.charCount(codePointBefore) + i5 + 1 + charCount5;
                                z3 = false;
                            }
                            if (flutterJNI.isCodePointEmojiModifier(codePointBefore)) {
                                int codePointBefore6 = Character.codePointBefore(c2073vA, charCount6);
                                int charCount10 = charCount6 - Character.charCount(codePointBefore6);
                                if (charCount10 <= 0 || !flutterJNI.isCodePointVariantSelector(codePointBefore6)) {
                                    i = 0;
                                } else {
                                    codePointBefore6 = Character.codePointBefore(c2073vA, charCount10);
                                    if (flutterJNI.isCodePointEmoji(codePointBefore6)) {
                                        i = Character.charCount(codePointBefore6);
                                        Character.charCount(codePointBefore6);
                                    }
                                }
                                if (flutterJNI.isCodePointEmojiModifierBase(codePointBefore6)) {
                                    charCount5 += Character.charCount(codePointBefore6) + i;
                                }
                            } else {
                                if (charCount6 > 0) {
                                    int codePointBefore7 = Character.codePointBefore(c2073vA, charCount6);
                                    charCount6 -= Character.charCount(codePointBefore7);
                                    if (codePointBefore7 == 8205) {
                                        int codePointBefore8 = Character.codePointBefore(c2073vA, charCount6);
                                        charCount6 -= Character.charCount(codePointBefore8);
                                        if (charCount6 <= 0 || !flutterJNI.isCodePointVariantSelector(codePointBefore8)) {
                                            i5 = 0;
                                        } else {
                                            codePointBefore8 = Character.codePointBefore(c2073vA, charCount6);
                                            i5 = Character.charCount(codePointBefore8);
                                            charCount6 -= Character.charCount(codePointBefore8);
                                        }
                                        codePointBefore = codePointBefore8;
                                        z3 = true;
                                        if (charCount6 != 0 || !z3 || !flutterJNI.isCodePointEmoji(codePointBefore)) {
                                            break;
                                            break;
                                        }
                                    } else {
                                        codePointBefore = codePointBefore7;
                                    }
                                }
                                i5 = 0;
                                if (charCount6 != 0) {
                                    break;
                                }
                            }
                        }
                    }
                }
                i2 = selectionEnd - charCount5;
            } else {
                i2 = 0;
            }
            min = Math.max(i2, 0);
        } else {
            FlutterJNI flutterJNI2 = (FlutterJNI) y1.i;
            int length = c2073vA.length();
            int i6 = length - 1;
            if (selectionEnd >= i6) {
                i3 = length;
            } else {
                int codePointAt = Character.codePointAt(c2073vA, selectionEnd);
                int charCount11 = Character.charCount(codePointAt);
                int i7 = selectionEnd + charCount11;
                if (i7 != 0) {
                    if (codePointAt == 10) {
                        if (Character.codePointAt(c2073vA, i7) == 13) {
                            charCount11++;
                        }
                    } else if (!flutterJNI2.isCodePointRegionalIndicator(codePointAt)) {
                        if (Y1.a0(codePointAt)) {
                            charCount11 += Character.charCount(codePointAt);
                        }
                        if (codePointAt == 8419) {
                            int codePointBefore9 = Character.codePointBefore(c2073vA, i7);
                            int charCount12 = Character.charCount(codePointBefore9) + i7;
                            if (charCount12 < length && flutterJNI2.isCodePointVariantSelector(codePointBefore9)) {
                                int codePointAt2 = Character.codePointAt(c2073vA, charCount12);
                                if (Y1.a0(codePointAt2)) {
                                    charCount2 = Character.charCount(codePointBefore9);
                                    charCount3 = Character.charCount(codePointAt2);
                                    charCount11 += charCount3 + charCount2;
                                }
                            } else if (Y1.a0(codePointBefore9)) {
                                charCount = Character.charCount(codePointBefore9);
                                charCount11 += charCount;
                            }
                        } else if (flutterJNI2.isCodePointEmoji(codePointAt)) {
                            boolean z4 = false;
                            int i8 = 0;
                            while (true) {
                                if (z4) {
                                    charCount11 = Character.charCount(codePointAt) + i8 + 1 + charCount11;
                                    z4 = false;
                                }
                                if (flutterJNI2.isCodePointEmojiModifier(codePointAt)) {
                                    break;
                                }
                                if (i7 < length) {
                                    int codePointAt3 = Character.codePointAt(c2073vA, i7);
                                    int charCount13 = Character.charCount(codePointAt3) + i7;
                                    if (codePointAt3 == 8419) {
                                        int codePointBefore10 = Character.codePointBefore(c2073vA, charCount13);
                                        int charCount14 = Character.charCount(codePointBefore10) + charCount13;
                                        if (charCount14 < length && flutterJNI2.isCodePointVariantSelector(codePointBefore10)) {
                                            int codePointAt4 = Character.codePointAt(c2073vA, charCount14);
                                            if (Y1.a0(codePointAt4)) {
                                                charCount2 = Character.charCount(codePointBefore10);
                                                charCount3 = Character.charCount(codePointAt4);
                                            }
                                        } else if (Y1.a0(codePointBefore10)) {
                                            charCount = Character.charCount(codePointBefore10);
                                        }
                                    } else {
                                        if (flutterJNI2.isCodePointEmojiModifier(codePointAt3)) {
                                            charCount4 = Character.charCount(codePointAt3);
                                            break;
                                        }
                                        if (flutterJNI2.isCodePointVariantSelector(codePointAt3)) {
                                            charCount4 = Character.charCount(codePointAt3);
                                            break;
                                        }
                                        if (codePointAt3 == 8205) {
                                            int codePointAt5 = Character.codePointAt(c2073vA, charCount13);
                                            int charCount15 = Character.charCount(codePointAt5) + charCount13;
                                            if (charCount15 < length && flutterJNI2.isCodePointVariantSelector(codePointAt5)) {
                                                int codePointAt6 = Character.codePointAt(c2073vA, charCount15);
                                                int charCount16 = Character.charCount(codePointAt6);
                                                int charCount17 = Character.charCount(codePointAt6) + charCount15;
                                                i8 = charCount16;
                                                i7 = charCount17;
                                                codePointAt = codePointAt6;
                                                z4 = true;
                                                if (i7 < length || !z4 || !flutterJNI2.isCodePointEmoji(codePointAt)) {
                                                    break;
                                                }
                                            } else {
                                                codePointAt = codePointAt5;
                                                i7 = charCount15;
                                                z4 = true;
                                            }
                                        } else {
                                            codePointAt = codePointAt3;
                                            i7 = charCount13;
                                        }
                                    }
                                }
                                i8 = 0;
                                if (i7 < length) {
                                    break;
                                    break;
                                }
                            }
                            charCount11 += charCount4;
                        }
                    } else if (i7 >= i6 || !flutterJNI2.isCodePointRegionalIndicator(Character.codePointAt(c2073vA, i7))) {
                        i3 = i7;
                    } else {
                        int i9 = selectionEnd;
                        while (i9 > 0 && flutterJNI2.isCodePointRegionalIndicator(Character.codePointBefore(c2073vA, selectionEnd))) {
                            i9 -= Character.charCount(Character.codePointBefore(c2073vA, selectionEnd));
                            i3++;
                        }
                        if (i3 % 2 == 0) {
                            charCount11 += 2;
                        }
                    }
                    i3 = selectionEnd + charCount11;
                }
            }
            min = Math.min(i3, c2073vA.length());
        }
        if (selectionStart != selectionEnd || z2) {
            setSelection(selectionStart, min);
            return true;
        }
        setSelection(min, min);
        return true;
    }

    @Override // android.view.inputmethod.BaseInputConnection, android.view.inputmethod.InputConnection
    public final boolean deleteSurroundingText(int i, int i2) {
        C2073vA c2073vA = this.d;
        c2073vA.getClass();
        if (Selection.getSelectionStart(c2073vA) == -1) {
            return true;
        }
        return super.deleteSurroundingText(i, i2);
    }

    public final boolean e(boolean z, boolean z2) {
        C2073vA c2073vA = this.d;
        int selectionStart = Selection.getSelectionStart(c2073vA);
        int selectionEnd = Selection.getSelectionEnd(c2073vA);
        boolean z3 = false;
        if (selectionStart < 0 || selectionEnd < 0) {
            return false;
        }
        if (selectionStart == selectionEnd && !z2) {
            z3 = true;
        }
        beginBatchEdit();
        DynamicLayout dynamicLayout = this.k;
        if (z3) {
            if (z) {
                Selection.moveUp(c2073vA, dynamicLayout);
            } else {
                Selection.moveDown(c2073vA, dynamicLayout);
            }
            int selectionStart2 = Selection.getSelectionStart(c2073vA);
            setSelection(selectionStart2, selectionStart2);
        } else {
            if (z) {
                Selection.extendUp(c2073vA, dynamicLayout);
            } else {
                Selection.extendDown(c2073vA, dynamicLayout);
            }
            setSelection(Selection.getSelectionStart(c2073vA), Selection.getSelectionEnd(c2073vA));
        }
        endBatchEdit();
        return true;
    }

    @Override // android.view.inputmethod.BaseInputConnection, android.view.inputmethod.InputConnection
    public final boolean endBatchEdit() {
        boolean endBatchEdit = super.endBatchEdit();
        this.n--;
        this.d.c();
        return endBatchEdit;
    }

    @Override // android.view.inputmethod.BaseInputConnection
    public final Editable getEditable() {
        return this.d;
    }

    @Override // android.view.inputmethod.BaseInputConnection, android.view.inputmethod.InputConnection
    public final ExtractedText getExtractedText(ExtractedTextRequest extractedTextRequest, int i) {
        this.f = (i & 1) != 0 ? extractedTextRequest : null;
        return c(extractedTextRequest);
    }

    @Override // android.view.inputmethod.BaseInputConnection, android.view.inputmethod.InputConnection
    public final boolean performContextMenuAction(int i) {
        beginBatchEdit();
        boolean z = true;
        C2073vA c2073vA = this.d;
        if (i == 16908319) {
            setSelection(0, c2073vA.length());
        } else {
            C0068Cn c0068Cn = this.a;
            if (i == 16908320) {
                int selectionStart = Selection.getSelectionStart(c2073vA);
                int selectionEnd = Selection.getSelectionEnd(c2073vA);
                if (selectionStart != selectionEnd) {
                    int min = Math.min(selectionStart, selectionEnd);
                    int max = Math.max(selectionStart, selectionEnd);
                    ((ClipboardManager) c0068Cn.getContext().getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("text label?", c2073vA.subSequence(min, max)));
                    c2073vA.delete(min, max);
                    setSelection(min, min);
                }
            } else if (i == 16908321) {
                int selectionStart2 = Selection.getSelectionStart(c2073vA);
                int selectionEnd2 = Selection.getSelectionEnd(c2073vA);
                if (selectionStart2 != selectionEnd2) {
                    ((ClipboardManager) c0068Cn.getContext().getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("text label?", c2073vA.subSequence(Math.min(selectionStart2, selectionEnd2), Math.max(selectionStart2, selectionEnd2))));
                }
            } else if (i == 16908322) {
                ClipData primaryClip = ((ClipboardManager) c0068Cn.getContext().getSystemService("clipboard")).getPrimaryClip();
                if (primaryClip != null) {
                    CharSequence coerceToText = primaryClip.getItemAt(0).coerceToText(c0068Cn.getContext());
                    int max2 = Math.max(0, Selection.getSelectionStart(c2073vA));
                    int max3 = Math.max(0, Selection.getSelectionEnd(c2073vA));
                    int min2 = Math.min(max2, max3);
                    int max4 = Math.max(max2, max3);
                    if (min2 != max4) {
                        c2073vA.delete(min2, max4);
                    }
                    c2073vA.insert(min2, coerceToText);
                    int length = coerceToText.length() + min2;
                    setSelection(length, length);
                }
            } else {
                z = false;
            }
        }
        endBatchEdit();
        return z;
    }

    @Override // android.view.inputmethod.BaseInputConnection, android.view.inputmethod.InputConnection
    public final boolean performEditorAction(int i) {
        int i2 = this.b;
        C0208Hx c0208Hx = this.c;
        if (i == 0) {
            ((C0950e6) c0208Hx.i).E("TextInputClient.performAction", Arrays.asList(Integer.valueOf(i2), "TextInputAction.unspecified"), null);
            return true;
        }
        if (i == 1) {
            ((C0950e6) c0208Hx.i).E("TextInputClient.performAction", Arrays.asList(Integer.valueOf(i2), "TextInputAction.newline"), null);
            return true;
        }
        if (i == 2) {
            ((C0950e6) c0208Hx.i).E("TextInputClient.performAction", Arrays.asList(Integer.valueOf(i2), "TextInputAction.go"), null);
            return true;
        }
        if (i == 3) {
            ((C0950e6) c0208Hx.i).E("TextInputClient.performAction", Arrays.asList(Integer.valueOf(i2), "TextInputAction.search"), null);
            return true;
        }
        if (i == 4) {
            ((C0950e6) c0208Hx.i).E("TextInputClient.performAction", Arrays.asList(Integer.valueOf(i2), "TextInputAction.send"), null);
            return true;
        }
        if (i == 5) {
            ((C0950e6) c0208Hx.i).E("TextInputClient.performAction", Arrays.asList(Integer.valueOf(i2), "TextInputAction.next"), null);
            return true;
        }
        if (i != 7) {
            ((C0950e6) c0208Hx.i).E("TextInputClient.performAction", Arrays.asList(Integer.valueOf(i2), "TextInputAction.done"), null);
            return true;
        }
        ((C0950e6) c0208Hx.i).E("TextInputClient.performAction", Arrays.asList(Integer.valueOf(i2), "TextInputAction.previous"), null);
        return true;
    }

    @Override // android.view.inputmethod.BaseInputConnection, android.view.inputmethod.InputConnection
    public final boolean performPrivateCommand(String str, Bundle bundle) {
        C0208Hx c0208Hx = this.c;
        c0208Hx.getClass();
        HashMap hashMap = new HashMap();
        hashMap.put("action", str);
        if (bundle != null) {
            HashMap hashMap2 = new HashMap();
            for (String str2 : bundle.keySet()) {
                Object obj = bundle.get(str2);
                if (obj instanceof byte[]) {
                    hashMap2.put(str2, bundle.getByteArray(str2));
                } else if (obj instanceof Byte) {
                    hashMap2.put(str2, Byte.valueOf(bundle.getByte(str2)));
                } else if (obj instanceof char[]) {
                    hashMap2.put(str2, bundle.getCharArray(str2));
                } else if (obj instanceof Character) {
                    hashMap2.put(str2, Character.valueOf(bundle.getChar(str2)));
                } else if (obj instanceof CharSequence[]) {
                    hashMap2.put(str2, bundle.getCharSequenceArray(str2));
                } else if (obj instanceof CharSequence) {
                    hashMap2.put(str2, bundle.getCharSequence(str2));
                } else if (obj instanceof float[]) {
                    hashMap2.put(str2, bundle.getFloatArray(str2));
                } else if (obj instanceof Float) {
                    hashMap2.put(str2, Float.valueOf(bundle.getFloat(str2)));
                }
            }
            hashMap.put(Constants.ScionAnalytics.MessageType.DATA_MESSAGE, hashMap2);
        }
        ((C0950e6) c0208Hx.i).E("TextInputClient.performPrivateCommand", Arrays.asList(Integer.valueOf(this.b), hashMap), null);
        return true;
    }

    @Override // android.view.inputmethod.BaseInputConnection, android.view.inputmethod.InputConnection
    public final boolean requestCursorUpdates(int i) {
        if ((i & 1) != 0) {
            this.j.updateCursorAnchorInfo(this.a, b());
        }
        this.g = (i & 2) != 0;
        return true;
    }

    @Override // android.view.inputmethod.BaseInputConnection, android.view.inputmethod.InputConnection
    public final boolean sendKeyEvent(KeyEvent keyEvent) {
        return this.m.B(keyEvent);
    }

    @Override // android.view.inputmethod.BaseInputConnection, android.view.inputmethod.InputConnection
    public final boolean setComposingText(CharSequence charSequence, int i) {
        beginBatchEdit();
        boolean commitText = charSequence.length() == 0 ? super.commitText(charSequence, i) : super.setComposingText(charSequence, i);
        endBatchEdit();
        return commitText;
    }

    @Override // android.view.inputmethod.BaseInputConnection, android.view.inputmethod.InputConnection
    public final boolean setSelection(int i, int i2) {
        beginBatchEdit();
        boolean selection = super.setSelection(i, i2);
        endBatchEdit();
        return selection;
    }
}
