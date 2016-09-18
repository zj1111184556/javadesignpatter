package com.bruce.designpatter.component;

import java.io.File;

public class RunMain {
	public static void main(String[] args){
//		File file = new File("/Users/jiezhou/Documents/ZenTalk");
//		//f.listFiles();
//		Component cp = new ConcreteComptent("/Users/jiezhou/Documents/ZenTalk");
//		for (File f : file.listFiles()){
//			if (f.isFile()){
//				cp.add(new Leaf(f.getName()));
//			}else{
//				cp.add(new ConcreteComptent(f.getAbsolutePath()));
//			}
//		}
		Component cp = setComponent("/Users/jiezhou/Documents/ZenTalk");
		cp.display();
	}
	
	public static Component setComponent(String path){
		File file = new File(path);
		Component cp = new ConcreteComptent(path);
		for (File f : file.listFiles()){
			if (f.isFile()){
				cp.add(new Leaf(f.getName()));
			}else{
				cp.add(setComponent(f.getAbsolutePath()));
			}
		}
		return cp;
	}
}
