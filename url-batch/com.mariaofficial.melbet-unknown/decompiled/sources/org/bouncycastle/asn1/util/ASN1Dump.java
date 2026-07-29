package org.bouncycastle.asn1.util;

import org.bouncycastle.asn1.ASN1BMPString;
import org.bouncycastle.asn1.ASN1BitString;
import org.bouncycastle.asn1.ASN1Boolean;
import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1Enumerated;
import org.bouncycastle.asn1.ASN1External;
import org.bouncycastle.asn1.ASN1GeneralizedTime;
import org.bouncycastle.asn1.ASN1GraphicString;
import org.bouncycastle.asn1.ASN1IA5String;
import org.bouncycastle.asn1.ASN1Integer;
import org.bouncycastle.asn1.ASN1Null;
import org.bouncycastle.asn1.ASN1NumericString;
import org.bouncycastle.asn1.ASN1ObjectDescriptor;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.ASN1OctetString;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1PrintableString;
import org.bouncycastle.asn1.ASN1RelativeOID;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.ASN1Set;
import org.bouncycastle.asn1.ASN1T61String;
import org.bouncycastle.asn1.ASN1TaggedObject;
import org.bouncycastle.asn1.ASN1UTCTime;
import org.bouncycastle.asn1.ASN1UTF8String;
import org.bouncycastle.asn1.ASN1Util;
import org.bouncycastle.asn1.ASN1VideotexString;
import org.bouncycastle.asn1.ASN1VisibleString;
import org.bouncycastle.asn1.BEROctetString;
import org.bouncycastle.asn1.BERSequence;
import org.bouncycastle.asn1.BERSet;
import org.bouncycastle.asn1.BERTaggedObject;
import org.bouncycastle.asn1.DERBitString;
import org.bouncycastle.asn1.DERSequence;
import org.bouncycastle.asn1.DERSet;
import org.bouncycastle.asn1.DERTaggedObject;
import org.bouncycastle.asn1.DLBitString;
import org.bouncycastle.util.Strings;
import org.bouncycastle.util.encoders.Hex;

/* loaded from: classes3.dex */
public class ASN1Dump {
    private static final int SAMPLE_SIZE = 32;
    private static final String TAB = "    ";

    static void _dumpAsString(String str, boolean z, ASN1Primitive aSN1Primitive, StringBuffer stringBuffer) {
        StringBuilder append;
        String str2;
        StringBuilder append2;
        int length;
        String lineSeparator = Strings.lineSeparator();
        if (aSN1Primitive instanceof ASN1Null) {
            stringBuffer.append(str);
            stringBuffer.append("NULL");
            stringBuffer.append(lineSeparator);
            return;
        }
        int i = 0;
        if (aSN1Primitive instanceof ASN1Sequence) {
            stringBuffer.append(str);
            stringBuffer.append(aSN1Primitive instanceof BERSequence ? "BER Sequence" : aSN1Primitive instanceof DERSequence ? "DER Sequence" : "Sequence");
            stringBuffer.append(lineSeparator);
            ASN1Sequence aSN1Sequence = (ASN1Sequence) aSN1Primitive;
            String str3 = str + TAB;
            int size = aSN1Sequence.size();
            while (i < size) {
                _dumpAsString(str3, z, aSN1Sequence.getObjectAt(i).toASN1Primitive(), stringBuffer);
                i++;
            }
            return;
        }
        if (aSN1Primitive instanceof ASN1Set) {
            stringBuffer.append(str);
            stringBuffer.append(aSN1Primitive instanceof BERSet ? "BER Set" : aSN1Primitive instanceof DERSet ? "DER Set" : "Set");
            stringBuffer.append(lineSeparator);
            ASN1Set aSN1Set = (ASN1Set) aSN1Primitive;
            String str4 = str + TAB;
            int size2 = aSN1Set.size();
            while (i < size2) {
                _dumpAsString(str4, z, aSN1Set.getObjectAt(i).toASN1Primitive(), stringBuffer);
                i++;
            }
            return;
        }
        if (aSN1Primitive instanceof ASN1TaggedObject) {
            stringBuffer.append(str);
            stringBuffer.append(aSN1Primitive instanceof BERTaggedObject ? "BER Tagged " : aSN1Primitive instanceof DERTaggedObject ? "DER Tagged " : "Tagged ");
            ASN1TaggedObject aSN1TaggedObject = (ASN1TaggedObject) aSN1Primitive;
            stringBuffer.append(ASN1Util.getTagText(aSN1TaggedObject));
            if (!aSN1TaggedObject.isExplicit()) {
                stringBuffer.append(" IMPLICIT ");
            }
            stringBuffer.append(lineSeparator);
            _dumpAsString(str + TAB, z, aSN1TaggedObject.getBaseObject().toASN1Primitive(), stringBuffer);
            return;
        }
        if (aSN1Primitive instanceof ASN1OctetString) {
            ASN1OctetString aSN1OctetString = (ASN1OctetString) aSN1Primitive;
            if (aSN1Primitive instanceof BEROctetString) {
                append2 = new StringBuilder().append(str).append("BER Constructed Octet String[");
                length = aSN1OctetString.getOctets().length;
            } else {
                append2 = new StringBuilder().append(str).append("DER Octet String[");
                length = aSN1OctetString.getOctets().length;
            }
            stringBuffer.append(append2.append(length).append("] ").toString());
            if (z) {
                stringBuffer.append(dumpBinaryDataAsString(str, aSN1OctetString.getOctets()));
                return;
            } else {
                stringBuffer.append(lineSeparator);
                return;
            }
        }
        if (aSN1Primitive instanceof ASN1ObjectIdentifier) {
            stringBuffer.append(str + "ObjectIdentifier(" + ((ASN1ObjectIdentifier) aSN1Primitive).getId() + ")" + lineSeparator);
            return;
        }
        if (aSN1Primitive instanceof ASN1RelativeOID) {
            stringBuffer.append(str + "RelativeOID(" + ((ASN1RelativeOID) aSN1Primitive).getId() + ")" + lineSeparator);
            return;
        }
        if (aSN1Primitive instanceof ASN1Boolean) {
            stringBuffer.append(str + "Boolean(" + ((ASN1Boolean) aSN1Primitive).isTrue() + ")" + lineSeparator);
            return;
        }
        if (aSN1Primitive instanceof ASN1Integer) {
            stringBuffer.append(str + "Integer(" + ((ASN1Integer) aSN1Primitive).getValue() + ")" + lineSeparator);
            return;
        }
        if (aSN1Primitive instanceof ASN1BitString) {
            ASN1BitString aSN1BitString = (ASN1BitString) aSN1Primitive;
            byte[] bytes = aSN1BitString.getBytes();
            int padBits = aSN1BitString.getPadBits();
            if (aSN1BitString instanceof DERBitString) {
                append = new StringBuilder().append(str);
                str2 = "DER Bit String[";
            } else if (aSN1BitString instanceof DLBitString) {
                append = new StringBuilder().append(str);
                str2 = "DL Bit String[";
            } else {
                append = new StringBuilder().append(str);
                str2 = "BER Bit String[";
            }
            stringBuffer.append(append.append(str2).append(bytes.length).append(", ").append(padBits).append("] ").toString());
            if (z) {
                stringBuffer.append(dumpBinaryDataAsString(str, bytes));
                return;
            } else {
                stringBuffer.append(lineSeparator);
                return;
            }
        }
        if (aSN1Primitive instanceof ASN1IA5String) {
            stringBuffer.append(str + "IA5String(" + ((ASN1IA5String) aSN1Primitive).getString() + ") " + lineSeparator);
            return;
        }
        if (aSN1Primitive instanceof ASN1UTF8String) {
            stringBuffer.append(str + "UTF8String(" + ((ASN1UTF8String) aSN1Primitive).getString() + ") " + lineSeparator);
            return;
        }
        if (aSN1Primitive instanceof ASN1NumericString) {
            stringBuffer.append(str + "NumericString(" + ((ASN1NumericString) aSN1Primitive).getString() + ") " + lineSeparator);
            return;
        }
        if (aSN1Primitive instanceof ASN1PrintableString) {
            stringBuffer.append(str + "PrintableString(" + ((ASN1PrintableString) aSN1Primitive).getString() + ") " + lineSeparator);
            return;
        }
        if (aSN1Primitive instanceof ASN1VisibleString) {
            stringBuffer.append(str + "VisibleString(" + ((ASN1VisibleString) aSN1Primitive).getString() + ") " + lineSeparator);
            return;
        }
        if (aSN1Primitive instanceof ASN1BMPString) {
            stringBuffer.append(str + "BMPString(" + ((ASN1BMPString) aSN1Primitive).getString() + ") " + lineSeparator);
            return;
        }
        if (aSN1Primitive instanceof ASN1T61String) {
            stringBuffer.append(str + "T61String(" + ((ASN1T61String) aSN1Primitive).getString() + ") " + lineSeparator);
            return;
        }
        if (aSN1Primitive instanceof ASN1GraphicString) {
            stringBuffer.append(str + "GraphicString(" + ((ASN1GraphicString) aSN1Primitive).getString() + ") " + lineSeparator);
            return;
        }
        if (aSN1Primitive instanceof ASN1VideotexString) {
            stringBuffer.append(str + "VideotexString(" + ((ASN1VideotexString) aSN1Primitive).getString() + ") " + lineSeparator);
            return;
        }
        if (aSN1Primitive instanceof ASN1UTCTime) {
            stringBuffer.append(str + "UTCTime(" + ((ASN1UTCTime) aSN1Primitive).getTime() + ") " + lineSeparator);
            return;
        }
        if (aSN1Primitive instanceof ASN1GeneralizedTime) {
            stringBuffer.append(str + "GeneralizedTime(" + ((ASN1GeneralizedTime) aSN1Primitive).getTime() + ") " + lineSeparator);
            return;
        }
        if (aSN1Primitive instanceof ASN1Enumerated) {
            stringBuffer.append(str + "DER Enumerated(" + ((ASN1Enumerated) aSN1Primitive).getValue() + ")" + lineSeparator);
            return;
        }
        if (aSN1Primitive instanceof ASN1ObjectDescriptor) {
            stringBuffer.append(str + "ObjectDescriptor(" + ((ASN1ObjectDescriptor) aSN1Primitive).getBaseGraphicString().getString() + ") " + lineSeparator);
            return;
        }
        if (!(aSN1Primitive instanceof ASN1External)) {
            stringBuffer.append(str + aSN1Primitive.toString() + lineSeparator);
            return;
        }
        ASN1External aSN1External = (ASN1External) aSN1Primitive;
        stringBuffer.append(str + "External " + lineSeparator);
        String str5 = str + TAB;
        if (aSN1External.getDirectReference() != null) {
            stringBuffer.append(str5 + "Direct Reference: " + aSN1External.getDirectReference().getId() + lineSeparator);
        }
        if (aSN1External.getIndirectReference() != null) {
            stringBuffer.append(str5 + "Indirect Reference: " + aSN1External.getIndirectReference().toString() + lineSeparator);
        }
        if (aSN1External.getDataValueDescriptor() != null) {
            _dumpAsString(str5, z, aSN1External.getDataValueDescriptor(), stringBuffer);
        }
        stringBuffer.append(str5 + "Encoding: " + aSN1External.getEncoding() + lineSeparator);
        _dumpAsString(str5, z, aSN1External.getExternalContent(), stringBuffer);
    }

    private static String calculateAscString(byte[] bArr, int i, int i2) {
        StringBuffer stringBuffer = new StringBuffer();
        for (int i3 = i; i3 != i + i2; i3++) {
            byte b = bArr[i3];
            if (b >= 32 && b <= 126) {
                stringBuffer.append((char) b);
            }
        }
        return stringBuffer.toString();
    }

    public static String dumpAsString(Object obj) {
        return dumpAsString(obj, false);
    }

    public static String dumpAsString(Object obj, boolean z) {
        ASN1Primitive aSN1Primitive;
        if (obj instanceof ASN1Primitive) {
            aSN1Primitive = (ASN1Primitive) obj;
        } else {
            if (!(obj instanceof ASN1Encodable)) {
                return "unknown object type " + obj.toString();
            }
            aSN1Primitive = ((ASN1Encodable) obj).toASN1Primitive();
        }
        StringBuffer stringBuffer = new StringBuffer();
        _dumpAsString("", z, aSN1Primitive, stringBuffer);
        return stringBuffer.toString();
    }

    private static String dumpBinaryDataAsString(String str, byte[] bArr) {
        String calculateAscString;
        String lineSeparator = Strings.lineSeparator();
        StringBuffer stringBuffer = new StringBuffer();
        String str2 = str + TAB;
        stringBuffer.append(lineSeparator);
        for (int i = 0; i < bArr.length; i += 32) {
            int length = bArr.length - i;
            stringBuffer.append(str2);
            if (length > 32) {
                stringBuffer.append(Strings.fromByteArray(Hex.encode(bArr, i, 32)));
                stringBuffer.append(TAB);
                calculateAscString = calculateAscString(bArr, i, 32);
            } else {
                stringBuffer.append(Strings.fromByteArray(Hex.encode(bArr, i, bArr.length - i)));
                for (int length2 = bArr.length - i; length2 != 32; length2++) {
                    stringBuffer.append("  ");
                }
                stringBuffer.append(TAB);
                calculateAscString = calculateAscString(bArr, i, bArr.length - i);
            }
            stringBuffer.append(calculateAscString);
            stringBuffer.append(lineSeparator);
        }
        return stringBuffer.toString();
    }
}
