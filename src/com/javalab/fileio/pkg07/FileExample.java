package com.javalab.fileio.pkg07;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * File 객체 - 탐색기의 파일에 대한 다양한 정보를 알아볼 수 있음.
 */
public class FileExample {

	public static void main(String[] args) throws IOException {

		// File 객체 생성(자바 내에서 사용되는 논리적인 파일 객체)
		File dir = new File("C:/filetest/images");
		File file1 = new File("C:/filetest/file1.txt");
		File file2 = new File("C:/filetest/file2.txt");
		File file3 = new File("C:/filetest/file3.txt");

		// 존재하지 않으면 디렉토리 또는 파일 생성
		if (dir.exists() == false) {
			dir.mkdir();	// 해당 폴더 생성
		}
		if (file1.exists() == false) {
			file1.createNewFile();	// 새로운 파일 생성(물리적으로)
		}
		if (file2.exists() == false) {
			file2.createNewFile();	// 새로운 파일 생성(물리적으로)
		}
		if (file3.exists() == false) {
			file3.createNewFile();	// 새로운 파일 생성(물리적으로)
		}

		// filetest 폴더의 내용 (하위폴더, 파일) 출력
		File temp = new File("C:/filetest");
		File[] contents = temp.listFiles();

		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd a HH:mm");	// 날짜를 지원해주는 SimpleDateFormat
		for (File file : contents) {
			System.out.printf("%-25s", sdf.format(new Date(file.lastModified())));
			if (file.isDirectory()) {
				System.out.printf("%-10s%-20s", "<DIR>", file.getName());
			} else {
				System.out.printf("%-10s%-20s", file.length(), file.getName());
			}
			System.out.println();
		}
	} // main e

} // class e
