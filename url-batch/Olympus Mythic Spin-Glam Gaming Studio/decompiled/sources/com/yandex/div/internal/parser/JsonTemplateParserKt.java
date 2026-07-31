package com.yandex.div.internal.parser;

import com.ironsource.B5;
import com.mobilefuse.sdk.identity.EidRequestBuilder;
import com.yandex.div.internal.template.Field;
import com.yandex.div.internal.template.FieldKt;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.ParsingEnvironment;
import com.yandex.div.json.ParsingErrorLogger;
import com.yandex.div.json.ParsingException;
import com.yandex.div.json.ParsingExceptionKt;
import com.yandex.div.json.ParsingExceptionReason;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.json.expressions.ExpressionList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* compiled from: JsonTemplateParser.kt */
@Metadata(d1 = {"\u0000v\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u001aa\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007\"\b\b\u0000\u0010\u0001*\u00020\u0000*\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u00072\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\t2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010\u001a\u0096\u0001\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00010\u0007\"\u0006\b\u0000\u0010\u0011\u0018\u0001\"\n\b\u0001\u0010\u0001\u0018\u0001*\u00020\u0000*\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u00072&\u0010\u0014\u001a\"\u0012\u0004\u0012\u00028\u0000\u0012\u0006\u0012\u0004\u0018\u00018\u00010\u0012j\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0006\u0012\u0004\u0018\u00018\u0001`\u00132\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00010\t2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\rH\u0086\b¢\u0006\u0004\b\u000f\u0010\u0015\u001a}\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007\"\b\b\u0000\u0010\u0001*\u00020\u0016*\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u00072(\u0010\u0019\u001a$\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00028\u00000\u0017j\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00028\u0000`\u00182\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\rH\u0007¢\u0006\u0004\b\u001a\u0010\u001b\u001aa\u0010\u001c\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007\"\b\b\u0000\u0010\u0001*\u00020\u0000*\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u00072\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\t2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u001c\u0010\u0010\u001a\u008f\u0001\u0010\u001c\u001a\b\u0012\u0004\u0012\u00028\u00010\u0007\"\u0004\b\u0000\u0010\u0011\"\b\b\u0001\u0010\u0001*\u00020\u0000*\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u00072&\u0010\u0014\u001a\"\u0012\u0004\u0012\u00028\u0000\u0012\u0006\u0012\u0004\u0018\u00018\u00010\u0012j\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0006\u0012\u0004\u0018\u00018\u0001`\u00132\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00010\t2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u001c\u0010\u0015\u001a}\u0010\u001c\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007\"\b\b\u0000\u0010\u0001*\u00020\u0016*\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u00072(\u0010\u0019\u001a$\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00028\u00000\u0017j\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00028\u0000`\u00182\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\rH\u0007¢\u0006\u0004\b\u001d\u0010\u001b\u001a}\u0010!\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u001e0\u0007\"\b\b\u0000\u0010\u0001*\u00020\u0000*\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0014\u0010\b\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u001e\u0018\u00010\u00072\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\u001f2\u000e\b\u0002\u0010 \u001a\b\u0012\u0004\u0012\u00028\u00000\t2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b!\u0010\"\u001a«\u0001\u0010!\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u001e0\u0007\"\u0004\b\u0000\u0010\u0011\"\b\b\u0001\u0010\u0001*\u00020\u0000*\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0014\u0010\b\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u001e\u0018\u00010\u00072&\u0010\u0014\u001a\"\u0012\u0004\u0012\u00028\u0000\u0012\u0006\u0012\u0004\u0018\u00018\u00010\u0012j\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0006\u0012\u0004\u0018\u00018\u0001`\u00132\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00010\u001f2\u000e\b\u0002\u0010 \u001a\b\u0012\u0004\u0012\u00028\u00010\t2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b!\u0010#\u001a\u0099\u0001\u0010!\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u001e0\u0007\"\b\b\u0000\u0010\u0001*\u00020\u0016*\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0014\u0010\b\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u001e\u0018\u00010\u00072(\u0010\u0019\u001a$\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00028\u00000\u0017j\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00028\u0000`\u00182\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\u001f2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\rH\u0007¢\u0006\u0004\b$\u0010%\u001a}\u0010&\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u001e0\u0007\"\b\b\u0000\u0010\u0001*\u00020\u0000*\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0014\u0010\b\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u001e\u0018\u00010\u00072\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\u001f2\u000e\b\u0002\u0010 \u001a\b\u0012\u0004\u0012\u00028\u00000\t2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b&\u0010\"\u001a«\u0001\u0010&\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u001e0\u0007\"\u0004\b\u0000\u0010\u0011\"\b\b\u0001\u0010\u0001*\u00020\u0000*\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0014\u0010\b\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u001e\u0018\u00010\u00072&\u0010\u0014\u001a\"\u0012\u0004\u0012\u00028\u0000\u0012\u0006\u0012\u0004\u0018\u00018\u00010\u0012j\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0006\u0012\u0004\u0018\u00018\u0001`\u00132\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00010\u001f2\u000e\b\u0002\u0010 \u001a\b\u0012\u0004\u0012\u00028\u00010\t2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b&\u0010#\u001a©\u0001\u0010&\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u001e0\u0007\"\b\b\u0000\u0010\u0001*\u00020\u0016*\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0014\u0010\b\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u001e\u0018\u00010\u00072(\u0010\u0019\u001a$\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00028\u00000\u0017j\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00028\u0000`\u00182\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\u001f2\u000e\b\u0002\u0010 \u001a\b\u0012\u0004\u0012\u00028\u00000\t2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\rH\u0007¢\u0006\u0004\b'\u0010(\u001a}\u0010)\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u001e0\u0007\"\b\b\u0000\u0010\u0001*\u00020\u0000*\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0014\u0010\b\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u001e\u0018\u00010\u00072\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\u001f2\u000e\b\u0002\u0010 \u001a\b\u0012\u0004\u0012\u00028\u00000\t2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b)\u0010\"\u001a«\u0001\u0010)\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u001e0\u0007\"\u0004\b\u0000\u0010\u0011\"\b\b\u0001\u0010\u0001*\u00020\u0000*\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0014\u0010\b\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u001e\u0018\u00010\u00072&\u0010\u0014\u001a\"\u0012\u0004\u0012\u00028\u0000\u0012\u0006\u0012\u0004\u0018\u00018\u00010\u0012j\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0006\u0012\u0004\u0018\u00018\u0001`\u00132\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00010\u001f2\u000e\b\u0002\u0010 \u001a\b\u0012\u0004\u0012\u00028\u00010\t2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b)\u0010#\u001a\u0099\u0001\u0010)\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u001e0\u0007\"\b\b\u0000\u0010\u0001*\u00020\u0016*\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0014\u0010\b\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u001e\u0018\u00010\u00072(\u0010\u0019\u001a$\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00028\u00000\u0017j\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00028\u0000`\u00182\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\u001f2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\rH\u0007¢\u0006\u0004\b*\u0010%\u001a\u0015\u0010.\u001a\u00020-2\u0006\u0010,\u001a\u00020+¢\u0006\u0004\b.\u0010/\u001a-\u00100\u001a\u0004\u0018\u00010\u0003*\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\rH\u0001¢\u0006\u0004\b0\u00101\u001a?\u00103\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0007\"\u0004\b\u0000\u0010\u00012\u0006\u0010\u0006\u001a\u00020\u00052\b\u00102\u001a\u0004\u0018\u00010\u00032\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0007H\u0001¢\u0006\u0004\b3\u00104\u001aY\u00106\u001a\u00020-\"\b\b\u0000\u0010\u0001*\u00020\u0000*\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00032\u000e\u00105\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u00072$\b\u0002\u0010\u0014\u001a\u001e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00000\u0012j\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u0000`\u0013¢\u0006\u0004\b6\u00107\u001ac\u00109\u001a\u00020-\"\b\b\u0000\u0010\u0001*\u00020\u0000\"\u0004\b\u0001\u0010\u0011*\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00032\u0014\u00105\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u000008\u0018\u00010\u00072\"\u0010\u0014\u001a\u001e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0012j\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001`\u0013¢\u0006\u0004\b9\u00107\u001a5\u00106\u001a\u00020-\"\b\b\u0000\u0010\u0001*\u00020\u0016*\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00032\u000e\u00105\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0007H\u0007¢\u0006\u0004\b:\u0010;\u001a9\u00109\u001a\u00020-\"\b\b\u0000\u0010\u0001*\u00020\u0000*\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00032\u0014\u00105\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u000008\u0018\u00010\u0007¢\u0006\u0004\b9\u0010;\u001a]\u0010=\u001a\u00020-\"\b\b\u0000\u0010\u0001*\u00020\u0000*\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00032\u0014\u00105\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000<\u0018\u00010\u00072\"\u0010\u0014\u001a\u001e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00000\u0012j\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u0000`\u0013¢\u0006\u0004\b=\u00107\u001a9\u0010=\u001a\u00020-\"\b\b\u0000\u0010\u0001*\u00020\u0000*\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00032\u0014\u00105\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000<\u0018\u00010\u0007¢\u0006\u0004\b=\u0010;\u001a;\u00106\u001a\u00020-\"\b\b\u0000\u0010\u0001*\u00020\u0000*\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00032\u0014\u00105\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u001e\u0018\u00010\u0007H\u0007¢\u0006\u0004\b>\u0010;\u001a_\u00106\u001a\u00020-\"\b\b\u0000\u0010\u0001*\u00020\u0000*\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00032\u0014\u00105\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u001e\u0018\u00010\u00072\"\u0010\u0014\u001a\u001e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00000\u0012j\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u0000`\u0013H\u0007¢\u0006\u0004\b>\u00107¨\u0006?"}, d2 = {"", "T", "Lorg/json/JSONObject;", "", "key", "", "overridable", "Lcom/yandex/div/internal/template/Field;", "fallback", "Lcom/yandex/div/internal/parser/ValueValidator;", "validator", "Lcom/yandex/div/json/ParsingErrorLogger;", "logger", "Lcom/yandex/div/json/ParsingEnvironment;", B5.o, "readField", "(Lorg/json/JSONObject;Ljava/lang/String;ZLcom/yandex/div/internal/template/Field;Lcom/yandex/div/internal/parser/ValueValidator;Lcom/yandex/div/json/ParsingErrorLogger;Lcom/yandex/div/json/ParsingEnvironment;)Lcom/yandex/div/internal/template/Field;", "R", "Lkotlin/Function1;", "Lcom/yandex/div/internal/parser/Converter;", "converter", "(Lorg/json/JSONObject;Ljava/lang/String;ZLcom/yandex/div/internal/template/Field;Lkotlin/jvm/functions/Function1;Lcom/yandex/div/internal/parser/ValueValidator;Lcom/yandex/div/json/ParsingErrorLogger;Lcom/yandex/div/json/ParsingEnvironment;)Lcom/yandex/div/internal/template/Field;", "Lcom/yandex/div/json/JSONSerializable;", "Lkotlin/Function2;", "Lcom/yandex/div/internal/parser/Creator;", "creator", "readSerializableField", "(Lorg/json/JSONObject;Ljava/lang/String;ZLcom/yandex/div/internal/template/Field;Lkotlin/jvm/functions/Function2;Lcom/yandex/div/json/ParsingErrorLogger;Lcom/yandex/div/json/ParsingEnvironment;)Lcom/yandex/div/internal/template/Field;", "readOptionalField", "readSerializableOptionalField", "", "Lcom/yandex/div/internal/parser/ListValidator;", "itemValidator", "readListField", "(Lorg/json/JSONObject;Ljava/lang/String;ZLcom/yandex/div/internal/template/Field;Lcom/yandex/div/internal/parser/ListValidator;Lcom/yandex/div/internal/parser/ValueValidator;Lcom/yandex/div/json/ParsingErrorLogger;Lcom/yandex/div/json/ParsingEnvironment;)Lcom/yandex/div/internal/template/Field;", "(Lorg/json/JSONObject;Ljava/lang/String;ZLcom/yandex/div/internal/template/Field;Lkotlin/jvm/functions/Function1;Lcom/yandex/div/internal/parser/ListValidator;Lcom/yandex/div/internal/parser/ValueValidator;Lcom/yandex/div/json/ParsingErrorLogger;Lcom/yandex/div/json/ParsingEnvironment;)Lcom/yandex/div/internal/template/Field;", "readSerializableListField", "(Lorg/json/JSONObject;Ljava/lang/String;ZLcom/yandex/div/internal/template/Field;Lkotlin/jvm/functions/Function2;Lcom/yandex/div/internal/parser/ListValidator;Lcom/yandex/div/json/ParsingErrorLogger;Lcom/yandex/div/json/ParsingEnvironment;)Lcom/yandex/div/internal/template/Field;", "readOptionalListField", "readSerializableOptionalListField", "(Lorg/json/JSONObject;Ljava/lang/String;ZLcom/yandex/div/internal/template/Field;Lkotlin/jvm/functions/Function2;Lcom/yandex/div/internal/parser/ListValidator;Lcom/yandex/div/internal/parser/ValueValidator;Lcom/yandex/div/json/ParsingErrorLogger;Lcom/yandex/div/json/ParsingEnvironment;)Lcom/yandex/div/internal/template/Field;", "readStrictListField", "readStrictSerializableListField", "Lcom/yandex/div/json/ParsingException;", EidRequestBuilder.REQUEST_FIELD_EMAIL, "", "suppressMissingValueOrThrow", "(Lcom/yandex/div/json/ParsingException;)V", "readReference", "(Lorg/json/JSONObject;Ljava/lang/String;Lcom/yandex/div/json/ParsingErrorLogger;Lcom/yandex/div/json/ParsingEnvironment;)Ljava/lang/String;", "reference", "referenceOrFallback", "(ZLjava/lang/String;Lcom/yandex/div/internal/template/Field;)Lcom/yandex/div/internal/template/Field;", "field", "writeField", "(Lorg/json/JSONObject;Ljava/lang/String;Lcom/yandex/div/internal/template/Field;Lkotlin/jvm/functions/Function1;)V", "Lcom/yandex/div/json/expressions/Expression;", "writeFieldWithExpression", "writeSerializableField", "(Lorg/json/JSONObject;Ljava/lang/String;Lcom/yandex/div/internal/template/Field;)V", "Lcom/yandex/div/json/expressions/ExpressionList;", "writeExpressionListField", "writeListField", "div-data_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class JsonTemplateParserKt {
    public static /* synthetic */ Field readField$default(JSONObject jSONObject, String str, boolean z, Field field, ValueValidator valueValidator, ParsingErrorLogger parsingErrorLogger, ParsingEnvironment parsingEnvironment, int i, Object obj) {
        if ((i & 8) != 0) {
            valueValidator = JsonParser.alwaysValid();
        }
        return readField(jSONObject, str, z, field, valueValidator, parsingErrorLogger, parsingEnvironment);
    }

    @NotNull
    public static final <T> Field<T> readField(@NotNull JSONObject jSONObject, @NotNull String str, boolean z, @Nullable Field<T> field, @NotNull ValueValidator<T> valueValidator, @NotNull ParsingErrorLogger parsingErrorLogger, @NotNull ParsingEnvironment parsingEnvironment) {
        try {
            return new Field.Value(z, JsonParserKt.read(jSONObject, str, valueValidator, parsingErrorLogger, parsingEnvironment));
        } catch (ParsingException e) {
            suppressMissingValueOrThrow(e);
            Field<T> referenceOrFallback = referenceOrFallback(z, readReference(jSONObject, str, parsingErrorLogger, parsingEnvironment), field);
            if (referenceOrFallback != null) {
                return referenceOrFallback;
            }
            throw e;
        }
    }

    public static /* synthetic */ Field readField$default(JSONObject jSONObject, String str, boolean z, Field field, Function1 function1, ValueValidator valueValidator, ParsingErrorLogger parsingErrorLogger, ParsingEnvironment parsingEnvironment, int i, Object obj) {
        Object obj2;
        if ((i & 16) != 0) {
            valueValidator = JsonParser.alwaysValid();
        }
        try {
            Object optSafe = JsonParserInternalsKt.optSafe(jSONObject, str);
            if (optSafe == null) {
                throw ParsingExceptionKt.missingValue(jSONObject, str);
            }
            Intrinsics.reifiedOperationMarker(2, "R");
            try {
                obj2 = function1.invoke(optSafe);
            } catch (Exception unused) {
                obj2 = null;
            }
            if (obj2 == null) {
                throw ParsingExceptionKt.invalidValue(jSONObject, str, optSafe);
            }
            if (valueValidator.isValid(obj2)) {
                return new Field.Value(z, obj2);
            }
            throw ParsingExceptionKt.invalidValue(jSONObject, str, obj2);
        } catch (ParsingException e) {
            suppressMissingValueOrThrow(e);
            Field referenceOrFallback = referenceOrFallback(z, readReference(jSONObject, str, parsingErrorLogger, parsingEnvironment), field);
            if (referenceOrFallback != null) {
                return referenceOrFallback;
            }
            throw e;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final /* synthetic */ <R, T> Field<T> readField(JSONObject jSONObject, String str, boolean z, Field<T> field, Function1 function1, ValueValidator<T> valueValidator, ParsingErrorLogger parsingErrorLogger, ParsingEnvironment parsingEnvironment) {
        Object obj;
        try {
            Object optSafe = JsonParserInternalsKt.optSafe(jSONObject, str);
            if (optSafe == null) {
                throw ParsingExceptionKt.missingValue(jSONObject, str);
            }
            Intrinsics.reifiedOperationMarker(2, "R");
            try {
                obj = function1.invoke(optSafe);
            } catch (Exception unused) {
                obj = null;
            }
            if (obj == null) {
                throw ParsingExceptionKt.invalidValue(jSONObject, str, optSafe);
            }
            if (valueValidator.isValid(obj)) {
                return new Field.Value(z, obj);
            }
            throw ParsingExceptionKt.invalidValue(jSONObject, str, obj);
        } catch (ParsingException e) {
            suppressMissingValueOrThrow(e);
            Field<T> referenceOrFallback = referenceOrFallback(z, readReference(jSONObject, str, parsingErrorLogger, parsingEnvironment), field);
            if (referenceOrFallback != null) {
                return referenceOrFallback;
            }
            throw e;
        }
    }

    @NotNull
    public static final <T extends JSONSerializable> Field<T> readSerializableField(@NotNull JSONObject jSONObject, @NotNull String str, boolean z, @Nullable Field<T> field, @NotNull Function2 function2, @NotNull ParsingErrorLogger parsingErrorLogger, @NotNull ParsingEnvironment parsingEnvironment) {
        try {
            return new Field.Value(z, JsonParserKt.read(jSONObject, str, function2, parsingErrorLogger, parsingEnvironment));
        } catch (ParsingException e) {
            suppressMissingValueOrThrow(e);
            Field<T> referenceOrFallback = referenceOrFallback(z, readReference(jSONObject, str, parsingErrorLogger, parsingEnvironment), field);
            if (referenceOrFallback != null) {
                return referenceOrFallback;
            }
            throw e;
        }
    }

    public static /* synthetic */ Field readOptionalField$default(JSONObject jSONObject, String str, boolean z, Field field, ValueValidator valueValidator, ParsingErrorLogger parsingErrorLogger, ParsingEnvironment parsingEnvironment, int i, Object obj) {
        if ((i & 8) != 0) {
            valueValidator = JsonParser.alwaysValid();
        }
        return readOptionalField(jSONObject, str, z, field, valueValidator, parsingErrorLogger, parsingEnvironment);
    }

    @NotNull
    public static final <T> Field<T> readOptionalField(@NotNull JSONObject jSONObject, @NotNull String str, boolean z, @Nullable Field<T> field, @NotNull ValueValidator<T> valueValidator, @NotNull ParsingErrorLogger parsingErrorLogger, @NotNull ParsingEnvironment parsingEnvironment) {
        Object readOptional = JsonParserKt.readOptional(jSONObject, str, valueValidator, parsingErrorLogger, parsingEnvironment);
        if (readOptional != null) {
            return new Field.Value(z, readOptional);
        }
        String readReference = readReference(jSONObject, str, parsingErrorLogger, parsingEnvironment);
        if (readReference != null) {
            return new Field.Reference(z, readReference);
        }
        if (field != null) {
            return FieldKt.clone(field, z);
        }
        return Field.INSTANCE.nullField(z);
    }

    @NotNull
    public static final <R, T> Field<T> readOptionalField(@NotNull JSONObject jSONObject, @NotNull String str, boolean z, @Nullable Field<T> field, @NotNull Function1 function1, @NotNull ValueValidator<T> valueValidator, @NotNull ParsingErrorLogger parsingErrorLogger, @NotNull ParsingEnvironment parsingEnvironment) {
        Object readOptional = JsonParserKt.readOptional(jSONObject, str, function1, valueValidator, parsingErrorLogger, parsingEnvironment);
        if (readOptional != null) {
            return new Field.Value(z, readOptional);
        }
        String readReference = readReference(jSONObject, str, parsingErrorLogger, parsingEnvironment);
        if (readReference != null) {
            return new Field.Reference(z, readReference);
        }
        if (field != null) {
            return FieldKt.clone(field, z);
        }
        return Field.INSTANCE.nullField(z);
    }

    @NotNull
    public static final <T extends JSONSerializable> Field<T> readSerializableOptionalField(@NotNull JSONObject jSONObject, @NotNull String str, boolean z, @Nullable Field<T> field, @NotNull Function2 function2, @NotNull ParsingErrorLogger parsingErrorLogger, @NotNull ParsingEnvironment parsingEnvironment) {
        JSONSerializable readOptional = JsonParserKt.readOptional(jSONObject, str, function2, parsingErrorLogger, parsingEnvironment);
        if (readOptional != null) {
            return new Field.Value(z, readOptional);
        }
        String readReference = readReference(jSONObject, str, parsingErrorLogger, parsingEnvironment);
        if (readReference != null) {
            return new Field.Reference(z, readReference);
        }
        if (field != null) {
            return FieldKt.clone(field, z);
        }
        return Field.INSTANCE.nullField(z);
    }

    @NotNull
    public static final <T> Field<List<T>> readListField(@NotNull JSONObject jSONObject, @NotNull String str, boolean z, @Nullable Field<List<T>> field, @NotNull ListValidator<T> listValidator, @NotNull ValueValidator<T> valueValidator, @NotNull ParsingErrorLogger parsingErrorLogger, @NotNull ParsingEnvironment parsingEnvironment) {
        try {
            return new Field.Value(z, JsonParserKt.readList(jSONObject, str, listValidator, valueValidator, parsingErrorLogger, parsingEnvironment));
        } catch (ParsingException e) {
            suppressMissingValueOrThrow(e);
            Field<List<T>> referenceOrFallback = referenceOrFallback(z, readReference(jSONObject, str, parsingErrorLogger, parsingEnvironment), field);
            if (referenceOrFallback != null) {
                return referenceOrFallback;
            }
            throw e;
        }
    }

    @NotNull
    public static final <R, T> Field<List<T>> readListField(@NotNull JSONObject jSONObject, @NotNull String str, boolean z, @Nullable Field<List<T>> field, @NotNull Function1 function1, @NotNull ListValidator<T> listValidator, @NotNull ValueValidator<T> valueValidator, @NotNull ParsingErrorLogger parsingErrorLogger, @NotNull ParsingEnvironment parsingEnvironment) {
        try {
            return new Field.Value(z, JsonParserKt.readList(jSONObject, str, function1, listValidator, valueValidator, parsingErrorLogger, parsingEnvironment));
        } catch (ParsingException e) {
            suppressMissingValueOrThrow(e);
            Field<List<T>> referenceOrFallback = referenceOrFallback(z, readReference(jSONObject, str, parsingErrorLogger, parsingEnvironment), field);
            if (referenceOrFallback != null) {
                return referenceOrFallback;
            }
            throw e;
        }
    }

    @NotNull
    public static final <T extends JSONSerializable> Field<List<T>> readSerializableListField(@NotNull JSONObject jSONObject, @NotNull String str, boolean z, @Nullable Field<List<T>> field, @NotNull Function2 function2, @NotNull ListValidator<T> listValidator, @NotNull ParsingErrorLogger parsingErrorLogger, @NotNull ParsingEnvironment parsingEnvironment) {
        try {
            return new Field.Value(z, JsonParserKt.readSerializableList(jSONObject, str, function2, listValidator, parsingErrorLogger, parsingEnvironment));
        } catch (ParsingException e) {
            suppressMissingValueOrThrow(e);
            Field<List<T>> referenceOrFallback = referenceOrFallback(z, readReference(jSONObject, str, parsingErrorLogger, parsingEnvironment), field);
            if (referenceOrFallback != null) {
                return referenceOrFallback;
            }
            throw e;
        }
    }

    @NotNull
    public static final <T> Field<List<T>> readOptionalListField(@NotNull JSONObject jSONObject, @NotNull String str, boolean z, @Nullable Field<List<T>> field, @NotNull ListValidator<T> listValidator, @NotNull ValueValidator<T> valueValidator, @NotNull ParsingErrorLogger parsingErrorLogger, @NotNull ParsingEnvironment parsingEnvironment) {
        List readOptionalList = JsonParserKt.readOptionalList(jSONObject, str, listValidator, valueValidator, parsingErrorLogger);
        if (readOptionalList != null) {
            return new Field.Value(z, readOptionalList);
        }
        String readReference = readReference(jSONObject, str, parsingErrorLogger, parsingEnvironment);
        if (readReference != null) {
            return new Field.Reference(z, readReference);
        }
        if (field != null) {
            return FieldKt.clone(field, z);
        }
        return Field.INSTANCE.nullField(z);
    }

    @NotNull
    public static final <R, T> Field<List<T>> readOptionalListField(@NotNull JSONObject jSONObject, @NotNull String str, boolean z, @Nullable Field<List<T>> field, @NotNull Function1 function1, @NotNull ListValidator<T> listValidator, @NotNull ValueValidator<T> valueValidator, @NotNull ParsingErrorLogger parsingErrorLogger, @NotNull ParsingEnvironment parsingEnvironment) {
        List readOptionalList = JsonParserKt.readOptionalList(jSONObject, str, function1, listValidator, valueValidator, parsingErrorLogger);
        if (readOptionalList != null) {
            return new Field.Value(z, readOptionalList);
        }
        String readReference = readReference(jSONObject, str, parsingErrorLogger, parsingEnvironment);
        if (readReference != null) {
            return new Field.Reference(z, readReference);
        }
        if (field != null) {
            return FieldKt.clone(field, z);
        }
        return Field.INSTANCE.nullField(z);
    }

    @NotNull
    public static final <T extends JSONSerializable> Field<List<T>> readSerializableOptionalListField(@NotNull JSONObject jSONObject, @NotNull String str, boolean z, @Nullable Field<List<T>> field, @NotNull Function2 function2, @NotNull ListValidator<T> listValidator, @NotNull ValueValidator<T> valueValidator, @NotNull ParsingErrorLogger parsingErrorLogger, @NotNull ParsingEnvironment parsingEnvironment) {
        List readOptionalSerializableList = JsonParserKt.readOptionalSerializableList(jSONObject, str, function2, listValidator, valueValidator, parsingErrorLogger, parsingEnvironment);
        if (readOptionalSerializableList != null) {
            return new Field.Value(z, readOptionalSerializableList);
        }
        String readReference = readReference(jSONObject, str, parsingErrorLogger, parsingEnvironment);
        if (readReference != null) {
            return new Field.Reference(z, readReference);
        }
        if (field != null) {
            return FieldKt.clone(field, z);
        }
        return Field.INSTANCE.nullField(z);
    }

    @NotNull
    public static final <T> Field<List<T>> readStrictListField(@NotNull JSONObject jSONObject, @NotNull String str, boolean z, @Nullable Field<List<T>> field, @NotNull ListValidator<T> listValidator, @NotNull ValueValidator<T> valueValidator, @NotNull ParsingErrorLogger parsingErrorLogger, @NotNull ParsingEnvironment parsingEnvironment) {
        try {
            return new Field.Value(z, JsonParserKt.readStrictList(jSONObject, str, listValidator, valueValidator, parsingErrorLogger));
        } catch (ParsingException e) {
            suppressMissingValueOrThrow(e);
            Field<List<T>> referenceOrFallback = referenceOrFallback(z, readReference(jSONObject, str, parsingErrorLogger, parsingEnvironment), field);
            if (referenceOrFallback != null) {
                return referenceOrFallback;
            }
            throw e;
        }
    }

    @NotNull
    public static final <R, T> Field<List<T>> readStrictListField(@NotNull JSONObject jSONObject, @NotNull String str, boolean z, @Nullable Field<List<T>> field, @NotNull Function1 function1, @NotNull ListValidator<T> listValidator, @NotNull ValueValidator<T> valueValidator, @NotNull ParsingErrorLogger parsingErrorLogger, @NotNull ParsingEnvironment parsingEnvironment) {
        try {
            return new Field.Value(z, JsonParserKt.readStrictList(jSONObject, str, function1, listValidator, valueValidator, parsingErrorLogger));
        } catch (ParsingException e) {
            suppressMissingValueOrThrow(e);
            Field<List<T>> referenceOrFallback = referenceOrFallback(z, readReference(jSONObject, str, parsingErrorLogger, parsingEnvironment), field);
            if (referenceOrFallback != null) {
                return referenceOrFallback;
            }
            throw e;
        }
    }

    @NotNull
    public static final <T extends JSONSerializable> Field<List<T>> readStrictSerializableListField(@NotNull JSONObject jSONObject, @NotNull String str, boolean z, @Nullable Field<List<T>> field, @NotNull Function2 function2, @NotNull ListValidator<T> listValidator, @NotNull ParsingErrorLogger parsingErrorLogger, @NotNull ParsingEnvironment parsingEnvironment) {
        try {
            return new Field.Value(z, JsonParserKt.readStrictSerializableList(jSONObject, str, function2, listValidator, parsingErrorLogger, parsingEnvironment));
        } catch (ParsingException e) {
            suppressMissingValueOrThrow(e);
            Field<List<T>> referenceOrFallback = referenceOrFallback(z, readReference(jSONObject, str, parsingErrorLogger, parsingEnvironment), field);
            if (referenceOrFallback != null) {
                return referenceOrFallback;
            }
            throw e;
        }
    }

    public static final void suppressMissingValueOrThrow(@NotNull ParsingException parsingException) {
        if (parsingException.getReason() != ParsingExceptionReason.MISSING_VALUE) {
            throw parsingException;
        }
    }

    @Nullable
    public static final String readReference(@NotNull JSONObject jSONObject, @NotNull String str, @NotNull ParsingErrorLogger parsingErrorLogger, @NotNull ParsingEnvironment parsingEnvironment) {
        return (String) JsonParserKt.readOptional(jSONObject, '$' + str, new ValueValidator() { // from class: com.yandex.div.internal.parser.JsonTemplateParserKt$$ExternalSyntheticLambda0
            @Override // com.yandex.div.internal.parser.ValueValidator
            public final boolean isValid(Object obj) {
                boolean readReference$lambda$27;
                readReference$lambda$27 = JsonTemplateParserKt.readReference$lambda$27((String) obj);
                return readReference$lambda$27;
            }
        }, parsingErrorLogger, parsingEnvironment);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean readReference$lambda$27(String str) {
        return str.length() > 0;
    }

    @Nullable
    public static final <T> Field<T> referenceOrFallback(boolean z, @Nullable String str, @Nullable Field<T> field) {
        if (str != null) {
            return new Field.Reference(z, str);
        }
        if (field != null) {
            return FieldKt.clone(field, z);
        }
        if (z) {
            return Field.INSTANCE.nullField(z);
        }
        return null;
    }

    public static /* synthetic */ void writeField$default(JSONObject jSONObject, String str, Field field, Function1 function1, int i, Object obj) {
        if ((i & 4) != 0) {
            function1 = new Function1() { // from class: com.yandex.div.internal.parser.JsonTemplateParserKt$writeField$1
                @Override // kotlin.jvm.functions.Function1
                @NotNull
                public final Object invoke(@NotNull Object obj2) {
                    return obj2;
                }
            };
        }
        writeField(jSONObject, str, field, function1);
    }

    public static final <T> void writeField(@NotNull JSONObject jSONObject, @NotNull String str, @Nullable Field<T> field, @NotNull Function1 function1) {
        if (field instanceof Field.Value) {
            JsonParserKt.write$default(jSONObject, str, function1.invoke(((Field.Value) field).value), null, 4, null);
        } else if (field instanceof Field.Reference) {
            JsonParserKt.write$default(jSONObject, '$' + str, ((Field.Reference) field).reference, null, 4, null);
        }
    }

    public static final <T, R> void writeFieldWithExpression(@NotNull JSONObject jSONObject, @NotNull String str, @Nullable Field<Expression<T>> field, @NotNull Function1 function1) {
        if (field instanceof Field.Value) {
            JsonParserKt.writeExpression(jSONObject, str, (Expression) ((Field.Value) field).value, function1);
        } else if (field instanceof Field.Reference) {
            JsonParserKt.write$default(jSONObject, '$' + str, ((Field.Reference) field).reference, null, 4, null);
        }
    }

    public static final <T extends JSONSerializable> void writeSerializableField(@NotNull JSONObject jSONObject, @NotNull String str, @Nullable Field<T> field) {
        if (field instanceof Field.Value) {
            JsonParserKt.write$default(jSONObject, str, ((JSONSerializable) ((Field.Value) field).value).writeToJSON(), null, 4, null);
        } else if (field instanceof Field.Reference) {
            JsonParserKt.write$default(jSONObject, '$' + str, ((Field.Reference) field).reference, null, 4, null);
        }
    }

    public static final <T> void writeFieldWithExpression(@NotNull JSONObject jSONObject, @NotNull String str, @Nullable Field<Expression<T>> field) {
        if (field instanceof Field.Value) {
            JsonParserKt.writeExpression(jSONObject, str, (Expression) ((Field.Value) field).value);
        } else if (field instanceof Field.Reference) {
            JsonParserKt.write$default(jSONObject, '$' + str, ((Field.Reference) field).reference, null, 4, null);
        }
    }

    public static final <T> void writeExpressionListField(@NotNull JSONObject jSONObject, @NotNull String str, @Nullable Field<ExpressionList<T>> field, @NotNull Function1 function1) {
        if (field instanceof Field.Value) {
            JsonParserKt.writeExpressionList(jSONObject, str, (ExpressionList) ((Field.Value) field).value, function1);
        } else if (field instanceof Field.Reference) {
            JsonParserKt.write$default(jSONObject, '$' + str, ((Field.Reference) field).reference, null, 4, null);
        }
    }

    public static final <T> void writeExpressionListField(@NotNull JSONObject jSONObject, @NotNull String str, @Nullable Field<ExpressionList<T>> field) {
        writeExpressionListField(jSONObject, str, field, JsonParser.doNotConvert());
    }

    public static final <T> void writeListField(@NotNull JSONObject jSONObject, @NotNull String str, @Nullable Field<List<T>> field) {
        if (field instanceof Field.Value) {
            JsonParserKt.write(jSONObject, str, (List) ((Field.Value) field).value);
        } else if (field instanceof Field.Reference) {
            JsonParserKt.write$default(jSONObject, '$' + str, ((Field.Reference) field).reference, null, 4, null);
        }
    }

    public static final <T> void writeListField(@NotNull JSONObject jSONObject, @NotNull String str, @Nullable Field<List<T>> field, @NotNull Function1 function1) {
        if (field instanceof Field.Value) {
            JsonParserKt.write(jSONObject, str, (List) ((Field.Value) field).value, function1);
        } else if (field instanceof Field.Reference) {
            JsonParserKt.write$default(jSONObject, '$' + str, ((Field.Reference) field).reference, null, 4, null);
        }
    }
}
