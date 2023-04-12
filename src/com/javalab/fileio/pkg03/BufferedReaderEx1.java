package com.javalab.fileio.pkg03;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

/**
 * 문자 입출력 FileReader, BufferedReader 클래스
 */
public class BufferedReaderEx1 { // class s

	public static void main(String[] args) { // main s

		try {
			File file = new File("c:/filetest/123.txt");	// 절대경로 탐색기에서 쓰는 경로
			FileReader fr = new FileReader(file);
			BufferedReader br = new BufferedReader(fr);
			
//			String line = "";
//			for(int i = 1;(line = br.readLine()) != null; i++) {
//				System.out.println(i + ":" + line);
//			}
			
			int lineNo = 1;
			while(true) {
				String str = br.readLine();	// 한 행을 읽어들임
				if(str == null) break;		// while문을 빠져나감
				System.out.println(lineNo + "\t" + str);
				lineNo++;
			}
			
			br.close();		// 자원 닫음
		} catch (IOException e) {}
	} // main e

} // class e
