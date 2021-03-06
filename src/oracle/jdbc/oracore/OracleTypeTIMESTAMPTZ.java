/*     */ package oracle.jdbc.oracore;
/*     */ 
/*     */ import java.io.IOException;
/*     */ import java.io.ObjectInputStream;
/*     */ import java.io.ObjectOutputStream;
/*     */ import java.io.Serializable;
/*     */ import java.sql.Date;
/*     */ import java.sql.SQLException;
/*     */ import java.sql.Time;
/*     */ import java.sql.Timestamp;
/*     */ import java.util.Map;
/*     */ import oracle.jdbc.driver.DatabaseError;
/*     */ import oracle.jdbc.internal.OracleConnection;
/*     */ import oracle.sql.DATE;
/*     */ import oracle.sql.Datum;
/*     */ import oracle.sql.TIMESTAMPTZ;
/*     */ 
/*     */ public class OracleTypeTIMESTAMPTZ extends OracleType
/*     */   implements Serializable
/*     */ {
/*     */   static final long serialVersionUID = 5643686037837085645L;
/*  57 */   int precision = 0;
/*     */   transient OracleConnection connection;
/* 248 */   private static final String _Copyright_2004_Oracle_All_Rights_Reserved_ = null;
/*     */   public static final boolean TRACE = false;
/*     */   public static final boolean PRIVATE_TRACE = false;
/*     */   public static final String BUILD_DATE = "Tue_Jan_24_08:54:27_PST_2006";
/*     */ 
/*     */   protected OracleTypeTIMESTAMPTZ()
/*     */   {
/*     */   }
/*     */ 
/*     */   public OracleTypeTIMESTAMPTZ(OracleConnection paramOracleConnection)
/*     */   {
/*  75 */     this.connection = paramOracleConnection;
/*     */   }
/*     */ 
/*     */   public int getTypeCode()
/*     */   {
/*  84 */     return -101;
/*     */   }
/*     */ 
/*     */   public void parseTDSrec(TDSReader paramTDSReader)
/*     */     throws SQLException
/*     */   {
/*  94 */     this.precision = paramTDSReader.readByte();
/*     */   }
/*     */ 
/*     */   public int getScale() throws SQLException
/*     */   {
/*  99 */     return 0;
/*     */   }
/*     */ 
/*     */   public int getPrecision() throws SQLException
/*     */   {
/* 104 */     return this.precision;
/*     */   }
/*     */ 
/*     */   public void readObject(ObjectInputStream paramObjectInputStream)
/*     */     throws IOException, ClassNotFoundException
/*     */   {
/* 115 */     this.precision = paramObjectInputStream.readByte();
/*     */   }
/*     */ 
/*     */   private void writeObject(ObjectOutputStream paramObjectOutputStream)
/*     */     throws IOException
/*     */   {
/* 124 */     paramObjectOutputStream.writeByte(this.precision);
/*     */   }
/*     */ 
/*     */   protected Object toObject(byte[] paramArrayOfByte, int paramInt, Map paramMap)
/*     */     throws SQLException
/*     */   {
/* 130 */     if ((paramArrayOfByte == null) || (paramArrayOfByte.length == 0)) {
/* 131 */       return null;
/*     */     }
/* 133 */     switch (paramInt)
/*     */     {
/*     */     case 1:
/* 137 */       return new TIMESTAMPTZ(paramArrayOfByte);
/*     */     case 2:
/* 140 */       return TIMESTAMPTZ.toTimestamp(this.connection, paramArrayOfByte);
/*     */     case 3:
/* 143 */       return paramArrayOfByte;
/*     */     }
/*     */ 
/* 146 */     DatabaseError.throwSqlException(59);
/*     */ 
/* 149 */     return null;
/*     */   }
/*     */ 
/*     */   public Datum toDatum(Object paramObject, OracleConnection paramOracleConnection)
/*     */     throws SQLException
/*     */   {
/* 165 */     TIMESTAMPTZ localTIMESTAMPTZ = null;
/*     */ 
/* 167 */     if (paramObject != null)
/*     */     {
/*     */       try
/*     */       {
/* 171 */         if ((paramObject instanceof TIMESTAMPTZ))
/* 172 */           localTIMESTAMPTZ = (TIMESTAMPTZ)paramObject;
/* 173 */         else if ((paramObject instanceof byte[]))
/* 174 */           localTIMESTAMPTZ = new TIMESTAMPTZ((byte[])paramObject);
/* 175 */         else if ((paramObject instanceof Timestamp))
/* 176 */           localTIMESTAMPTZ = new TIMESTAMPTZ(paramOracleConnection, (Timestamp)paramObject);
/* 177 */         else if ((paramObject instanceof DATE))
/* 178 */           localTIMESTAMPTZ = new TIMESTAMPTZ(paramOracleConnection, (DATE)paramObject);
/* 179 */         else if ((paramObject instanceof String))
/* 180 */           localTIMESTAMPTZ = new TIMESTAMPTZ(paramOracleConnection, (String)paramObject);
/* 181 */         else if ((paramObject instanceof Date))
/* 182 */           localTIMESTAMPTZ = new TIMESTAMPTZ(paramOracleConnection, (Date)paramObject);
/* 183 */         else if ((paramObject instanceof Time))
/* 184 */           localTIMESTAMPTZ = new TIMESTAMPTZ(paramOracleConnection, (Time)paramObject);
/*     */         else {
/* 186 */           DatabaseError.throwSqlException(59, paramObject);
/*     */         }
/*     */       }
/*     */       catch (Exception localException)
/*     */       {
/* 191 */         DatabaseError.throwSqlException(59, paramObject);
/*     */       }
/*     */ 
/*     */     }
/*     */ 
/* 196 */     return localTIMESTAMPTZ;
/*     */   }
/*     */ 
/*     */   protected Object unpickle80rec(UnpickleContext paramUnpickleContext, int paramInt1, int paramInt2, Map paramMap)
/*     */     throws SQLException
/*     */   {
/* 219 */     DatabaseError.throwSqlException(90);
/*     */ 
/* 221 */     return null;
/*     */   }
/*     */ 
/*     */   protected Object unpickle81rec(UnpickleContext paramUnpickleContext, int paramInt1, int paramInt2, Map paramMap)
/*     */     throws SQLException
/*     */   {
/* 238 */     DatabaseError.throwSqlException(90);
/*     */ 
/* 240 */     return null;
/*     */   }
/*     */ }

/* Location:           /Users/admin/.m2/repository/com/alibaba/external/jdbc.oracle/10.2.0.2/jdbc.oracle-10.2.0.2.jar
 * Qualified Name:     oracle.jdbc.oracore.OracleTypeTIMESTAMPTZ
 * JD-Core Version:    0.6.0
 */