package com.squareup.moshi;

import o.C1097gL;
import o.C1347k9;
import o.G8;
import o.HS;
import o.N8;
import o.NV;

/* loaded from: classes.dex */
final class JsonValueSource implements HS {
    static final C1347k9 STATE_C_STYLE_COMMENT;
    static final C1347k9 STATE_DOUBLE_QUOTED;
    static final C1347k9 STATE_END_OF_JSON;
    static final C1347k9 STATE_END_OF_LINE_COMMENT;
    static final C1347k9 STATE_JSON;
    static final C1347k9 STATE_SINGLE_QUOTED;
    private final G8 buffer;
    private boolean closed;
    private long limit;
    private final G8 prefix;
    private final N8 source;
    private int stackSize;
    private C1347k9 state;

    static {
        C1347k9 c1347k9 = C1347k9.k;
        STATE_JSON = C1097gL.d0("[]{}\"'/#");
        STATE_SINGLE_QUOTED = C1097gL.d0("'\\");
        STATE_DOUBLE_QUOTED = C1097gL.d0("\"\\");
        STATE_END_OF_LINE_COMMENT = C1097gL.d0("\r\n");
        STATE_C_STYLE_COMMENT = C1097gL.d0("*");
        STATE_END_OF_JSON = C1347k9.k;
    }

    public JsonValueSource(N8 n8) {
        this(n8, new G8(), STATE_JSON, 0);
    }

    private void advanceLimit(long j) {
        while (true) {
            long j2 = this.limit;
            if (j2 >= j) {
                return;
            }
            C1347k9 c1347k9 = this.state;
            C1347k9 c1347k92 = STATE_END_OF_JSON;
            if (c1347k9 == c1347k92) {
                return;
            }
            if (j2 == this.buffer.i) {
                if (j2 > 0) {
                    return;
                } else {
                    this.source.y(1L);
                }
            }
            long x = this.buffer.x(this.state, this.limit);
            if (x == -1) {
                this.limit = this.buffer.i;
            } else {
                byte q = this.buffer.q(x);
                C1347k9 c1347k93 = this.state;
                C1347k9 c1347k94 = STATE_JSON;
                if (c1347k93 == c1347k94) {
                    if (q == 34) {
                        this.state = STATE_DOUBLE_QUOTED;
                        this.limit = x + 1;
                    } else if (q == 35) {
                        this.state = STATE_END_OF_LINE_COMMENT;
                        this.limit = x + 1;
                    } else if (q == 39) {
                        this.state = STATE_SINGLE_QUOTED;
                        this.limit = x + 1;
                    } else if (q != 47) {
                        if (q != 91) {
                            if (q != 93) {
                                if (q != 123) {
                                    if (q != 125) {
                                    }
                                }
                            }
                            int i = this.stackSize - 1;
                            this.stackSize = i;
                            if (i == 0) {
                                this.state = c1347k92;
                            }
                            this.limit = x + 1;
                        }
                        this.stackSize++;
                        this.limit = x + 1;
                    } else {
                        long j3 = 2 + x;
                        this.source.y(j3);
                        long j4 = x + 1;
                        byte q2 = this.buffer.q(j4);
                        if (q2 == 47) {
                            this.state = STATE_END_OF_LINE_COMMENT;
                            this.limit = j3;
                        } else if (q2 == 42) {
                            this.state = STATE_C_STYLE_COMMENT;
                            this.limit = j3;
                        } else {
                            this.limit = j4;
                        }
                    }
                } else if (c1347k93 == STATE_SINGLE_QUOTED || c1347k93 == STATE_DOUBLE_QUOTED) {
                    if (q == 92) {
                        long j5 = x + 2;
                        this.source.y(j5);
                        this.limit = j5;
                    } else {
                        if (this.stackSize > 0) {
                            c1347k92 = c1347k94;
                        }
                        this.state = c1347k92;
                        this.limit = x + 1;
                    }
                } else if (c1347k93 == STATE_C_STYLE_COMMENT) {
                    long j6 = 2 + x;
                    this.source.y(j6);
                    long j7 = x + 1;
                    if (this.buffer.q(j7) == 47) {
                        this.limit = j6;
                        this.state = c1347k94;
                    } else {
                        this.limit = j7;
                    }
                } else {
                    if (c1347k93 != STATE_END_OF_LINE_COMMENT) {
                        throw new AssertionError();
                    }
                    this.limit = x + 1;
                    this.state = c1347k94;
                }
            }
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.closed = true;
    }

    public void discard() {
        this.closed = true;
        while (this.state != STATE_END_OF_JSON) {
            advanceLimit(8192L);
            this.source.skip(this.limit);
        }
    }

    @Override // o.HS
    public long read(G8 g8, long j) {
        if (this.closed) {
            throw new IllegalStateException("closed");
        }
        if (j == 0) {
            return 0L;
        }
        if (!this.prefix.m()) {
            long read = this.prefix.read(g8, j);
            long j2 = j - read;
            if (!this.buffer.m()) {
                long read2 = read(g8, j2);
                if (read2 != -1) {
                    return read2 + read;
                }
            }
            return read;
        }
        advanceLimit(j);
        long j3 = this.limit;
        if (j3 == 0) {
            if (this.state == STATE_END_OF_JSON) {
                return -1L;
            }
            throw new AssertionError();
        }
        long min = Math.min(j, j3);
        g8.write(this.buffer, min);
        this.limit -= min;
        return min;
    }

    @Override // o.HS
    public NV timeout() {
        return this.source.timeout();
    }

    public JsonValueSource(N8 n8, G8 g8, C1347k9 c1347k9, int i) {
        this.limit = 0L;
        this.closed = false;
        this.source = n8;
        this.buffer = n8.a();
        this.prefix = g8;
        this.state = c1347k9;
        this.stackSize = i;
    }
}
