/*       */ package oracle.jdbc.driver;
/*       */ 
/*       */ class LongRawStreamBinder extends Binder
/*       */ {
/*       */   LongRawStreamBinder()
/*       */   {
/* 16748 */     this.type = 24;
/* 16749 */     this.bytelen = 0;
/*       */   }
/*       */ 
/*       */   void bind(OraclePreparedStatement paramOraclePreparedStatement, int paramInt1, int paramInt2, int paramInt3, byte[] paramArrayOfByte, char[] paramArrayOfChar, short[] paramArrayOfShort, int paramInt4, int paramInt5, int paramInt6, int paramInt7, int paramInt8, int paramInt9, boolean paramBoolean)
/*       */   {
/* 16758 */     paramArrayOfShort[paramInt9] = 0;
/*       */   }
/*       */ 
/*       */   Binder copyingBinder()
/*       */   {
/* 16763 */     return OraclePreparedStatementReadOnly.theStaticRawNullBinder;
/*       */   }
/*       */ }

/* Location:           /Users/admin/.m2/repository/com/alibaba/external/jdbc.oracle/10.2.0.2/jdbc.oracle-10.2.0.2.jar
 * Qualified Name:     oracle.jdbc.driver.LongRawStreamBinder
 * JD-Core Version:    0.6.0
 */