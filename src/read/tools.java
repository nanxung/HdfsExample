package read;

import org.apache.hadoop.fs.FileSystem;

public class tools {
	/*
	 * 1.创建文件
	 * FileSystem.create
	 * public abstract FSDataOutputStream create(Path f,
	 * 									FSPermission permission,
	 * 									int bufferSize,
	 * 									short replication,
	 * 									long blockSize,
	 * 									Progressable progress)
	 * 									Throws IOException
	 * 
	 * f 文件名
	 * overwrite 如果存在同名文件，overwrite为true则覆盖它
	 * bufferSize 文件缓存大小。默认值：Configuration中fs.local.block.size的值，默认是32M
	 * replication 创建的副本数目，默认值是32
	 * permission和progress和具体文件系统实现有关
	 * 
	 * 大部分情况下用到下面的版本
	 * public FSDataOutputStream create(Path f);
	 * public FSDataOutputStream create(Path f,boolean overwrite);
	 * public FSDataOutputStream create(Path f,boolean overwrite,int bufferSize);
	 */
	
	
	/*
	 * 2.打开文件
	 * FileSystem.open方法有俩个，参数最多的方法定义如下
	 * public abstract FSDataInputStream open(Path f,int bufferSize) throws IOException
	 * 
	 * f 文件名
	 * bufferSize 文件缓存大小。默认值：Configuration中io.file.buffer.size的值，如果Configuration中未设置值，则默认为4096
	 * 
	 *  
	 */
	
	/*
	 * 3.获取文件信息
	 * FileSystem.getFileStatus方法格式如下
	 * public abstract FileStatus getFileStatus(Path f) throws IOException
	 * 该函数返回一个FileStatus对象。
	 * path 文件路径
	 * length 文件长度
	 * isDir 是否为目录
	 * block_replication 数据块副本因子
	 * blockSize 文件长度
	 * modification_time 最近一次修改时间
	 * owner 文件所属用户
	 * group 文件所属组
	 * 
	 */
	
	/*
	 * 4.获取目录信息
	 * public FileStatus[] listStatus(Path f) throws IOException;
	 * 如果f是目录，那么将目录之下的每个目录或者文件信息保存在FileStus数组中返回。如果f是文件，那么作用和getFileStatus一致
	 * 
	 * 利用正则表达式提取文件信息
	 * public FileStatus[] globStatus(Path pathPattern) throws IOException;
	 * 参数pathPattern中，可以像正则表达式一样，使用通配符来表示匹配规则：
	 * ？   表示任意的单个字符
	 * * 任意长度的任意字符
	 * [abc] 表示匹配a,b,c中的任意字符
	 * [a-b] 表示匹配a-b之内的单个字符
	 * [^a] 表示匹配除了a之外的单个字符
	 * \c 表示取消特殊字符的转义，比如\*的结果是*而不是随意匹配
	 * {ab,cd} 表示匹配ab或者cd中的一个串
	 * {ab,c{de,fh}} 表示匹配ab或者cde或者cfh中的一串
	 */
	
	/*
	 * 5.读取
	 * public int read(long position,byte[] buffer,int offset,int length) throws IOException;
	 * 函数的意义：从文件的指定位置position开始，读取最多length字节的数据，保存到buffer中从offset个元素开始的空间中，返回值为实际读取的字节数。此函数不改变文件的offset值。
	 * 简化版本
	 * public final int read(byte[] b) throws IOException
	 * 从文件当前位置读取最多长度为b.len的数据保存到b中，返回值为实际读取的字节数
	 * 
	 */
	
	
	/*
	 * 
	 * 6.写入
	 * public void write(byte[] b,int off,int len) throws IOException;
	 * 该函数意义是：将b中从off开始的最多len个字节的数据写入文件的当前位置。返回值为实际写入的字节数。
	 */
	
	/*
	 * 7.关闭
	 * 关闭未打开的逆过程
	 * FileSystem.close定义如下
	 * public void close() throws IOException
	 * 不需要其他操作而关闭文件。释放所有持有的锁。
	 */
	
	/*
	 * 8.删除
	 * FileSystem.delete定义如下
	 * public abstract boolean delete(Path f,boolean recursive) throws IOException
	 * 其中各项含义如下
	 * f 待删除的文件名
	 * recursive 如果recursive为true,并且f是目录，那么会递归删除f下的所有文件,如果f是文件，则无影响
	 * 退出时再删除
	 * public boolean deleteOnExit(Path f) throws IOException
	 * 标记文件f,当系统关闭时才真正删除文件，但是这个文件f在系统关闭前必须存在。
	 */
public void createrFile(){
	
}
}
