/**
 * Copyright 2010 ASTO.
 * All right reserved.
 * Created on 2010-7-26
 */
package com.ast.ast1949.util;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.List;
import java.util.Properties;

/**
 * @author Rolyer (rolyer.live@gmail.com)
 *
 */
public class FileUtils {
	/**
	 * 功　能: 创建文件夹
	 *
	 * @param path
	 *            参　数:要创建的文件夹名称
	 * @return 返回值: 如果成功true;否则false
	 */
	public static boolean makedir(String path) {
		File file = new File(path);
		if (!file.exists())
			return file.mkdirs();
		else
			return true;
	}

	/**
	 * 保存文件
	 *
	 * @param stream
	 * @param path
	 *            存放路径
	 * @param filename
	 *            文件名
	 * @throws IOException
	 */
	public static void SaveFileFromInputStream(InputStream stream, String path, String filename)
			throws IOException {
		FileOutputStream fs = new FileOutputStream(path + "/" + filename);
		byte[] buffer = new byte[1024 * 1024];
		int bytesum = 0;
		int byteread = 0;
		while ((byteread = stream.read(buffer)) != -1) {
			bytesum += byteread;
			fs.write(buffer, 0, byteread);
			fs.flush();
		}
		fs.close();
		stream.close();
	}

	/**
	 * 删除某个文件
	 * @param path:文件路径,需要提供完整的路径,如:/tmp/tmp.txt
	 * @return
	 */
	public static boolean deleteFile(String path){
		File f = new File(path);
		boolean b = false;
		if(f.exists()){
			b = f.delete();
		}
		return b;
	}

	/**
	 * 删除文件夹及文件
	 * @param folderPath:文件夹路径
	 * @return
	 */
	public static void deleteFolderAndFile(File file){
		if(file.exists()){
			if(file.isFile()){
				file.delete();
			}else if(file.isDirectory()){
				File[] files=file.listFiles();
				for(int i=0;i<files.length;i++){
					deleteFolderAndFile(files[i]);
				}
				file.delete();
			}
		}
	}
	
	/**
	 * 列出某个目录下的所有文件,子目录不列出
	 * @param folderPath:文件夹路径
	 * @return
	 */
	public static List<String> listFile(String folderPath){
		List<String> fileList = new ArrayList<String>(); //FileViewer.getListFiles(destPath, null, false);
		File f = new File(folderPath);
		File[] t = f.listFiles();
		for(int i = 0; i < t.length; i++){
			fileList.add(t[i].getAbsolutePath());
		}
		return fileList;
	}


	/**
	 * 判断文件是否存在
	 * 
	 * @param fileName
	 * @return
	 */
	public static boolean exists(String fileName) {
		File file = new File(fileName);
		if (file.exists()) {
			return true;
		} else {
			return false;
		}
	}

	/**
	 * 取当前路径
	 * 
	 * @return
	 */
	public static String getCurrentPath() {
		File directory = new File(".");
		String nowPath = "";
		try {
			nowPath = directory.getCanonicalFile().toString();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return nowPath;
	}

	/**
	 * 获取文件扩展名
	 * 
	 * @param fileName
	 * @return
	 * */
	public static String getFileExtendName(String fileName) {
		if (fileName == null) {
			return "";
		} else {
			return fileName.substring(fileName.lastIndexOf(".") + 1, fileName
					.length());
		}
	}

	/**
	 * 创建一个新文件，如果存在则报错
	 * 
	 * @param filePath
	 * @param fileName
	 * @return
	 */
	public static void createFile(String filePath, String fileName)
			throws RuntimeException {
		String file = null;
		if (filePath == null) {
			file = fileName;
		} else {
			file = filePath + File.separator + fileName;
		}
		createFile(file);
	}

	/**
	 * 创建一个新文件(含路径)，如果存在则报错
	 * 
	 * @param fileName
	 *            含有路径的文件名
	 * @return
	 */
	public static void createFile(String fileName) throws RuntimeException {
		File f = new File(fileName);
		if (f.exists()) {
			throw new RuntimeException("FILE_EXIST_ERROR");
		} else {
			try {
				File fileFolder = f.getParentFile();
				if (!fileFolder.exists())
					fileFolder.mkdirs();
				f.createNewFile();
			} catch (IOException ie) {
				System.out.println("文件" + fileName + "创建失败：" + ie.getMessage());
				throw new RuntimeException("FILE_CREATE_ERROR");
			}
		}
	}
 

	/**
	 * 创建目录，如果存在则不创建
	 * 
	 * @param path
	 * @return 返回结果null则创建成功，否则返回的是错误信息
	 * @return
	 */
	public static String createDir(String path, boolean isCreateSubPah) {
		String msg = null;
		File dir = new File(path);

		if (dir == null) {
			msg = "不能创建空目录";
			return msg;
		}
		if (dir.isFile()) {
			msg = "已有同名文件存在";
			return msg;
		}
		if (!dir.exists()) {
			if (isCreateSubPah && !dir.mkdirs()) {
				msg = "目录创建失败，原因不明";
			} else if (!dir.mkdir()) {
				msg = "目录创建失败，原因不明";
			}
		}
		return msg;
	}
	
	/**
	 * 删除指定目录或文件。 如果要删除是目录，同时删除子目录下所有的文件
	 * 
	 * @file:File 目录
	 * */
	public static void delFileOrFolder(String fileName) {
		if (!exists(fileName))
			return;
		File file = new File(fileName);
		delFileOrFolder(file);
	}

	/**
	 * 删除指定目录或文件。 如果要删除是目录，同时删除子目录下所有的文件
	 * 
	 * @file:File 目录
	 * */
	public static void delFileOrFolder(File file) {
		if (!file.exists())
			return;
		if (file.isFile()) {
			file.delete();
		} else {
			File[] sub = file.listFiles();
			if (sub == null || sub.length <= 0) {
				file.delete();
			} else {
				for (int i = 0; i < sub.length; i++) {
					delFileOrFolder(sub[i]);
				}
				file.delete();
			}
		}
	}
	
	/**
	 * 从Properties格式配置文件中获取所有参数并保存到HashMap中。
	 * 配置中的key值即map表中的key值，如果配置文件保存时用的中文，则返回结果也会转成中文。
	 * 
	 * @param file
	 * @return
	 * @throws IOException
	 */
	public static HashMap readPropertyFile(String file,String charsetName) throws IOException {
		if (charsetName==null || charsetName.trim().length()==0){
			charsetName="gbk";
		}
		HashMap map = new HashMap();
		InputStream is = FileUtils.class.getClassLoader().getResourceAsStream(file);
		Properties properties = new Properties();
		properties.load(is);
		Enumeration en = properties.propertyNames();
		while (en.hasMoreElements()) {
			String key = (String) en.nextElement();
			String code = new String(properties.getProperty(key).getBytes(
					"ISO-8859-1"), charsetName);
			map.put(key, code);
		}
		return map;
	}

}
