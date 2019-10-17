package com.zmh.prototype.deepclone;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class DeepPrototype implements Serializable, Cloneable {

	private static final long serialVersionUID = 1L;

	public String name;
	public DeepCloneableTarget deepCloneableTarget;

	public DeepPrototype() {
		super();
	}

	// 深拷贝 - 方式1 使用clone
	@Override
	protected Object clone() throws CloneNotSupportedException {
		Object deep = null;
		// 这里完成对基本数据类型和字符串类型的克隆
		deep = super.clone();
		// 对应用类型的属性进行单独的处理
		DeepPrototype deepPrototype = (DeepPrototype) deep;
		deepPrototype.deepCloneableTarget = (DeepCloneableTarget) deepCloneableTarget.clone();
		return deepPrototype;
	}

	// 深拷贝 - 方式2 使用序列化
	public Object deepClone() throws Exception {
		// 创建流对象
		ByteArrayOutputStream bos = null;
		ObjectOutputStream oos = null;
		ByteArrayInputStream bis = null;
		ObjectInputStream ois = null;

		// 序列化
		bos = new ByteArrayOutputStream();
		oos = new ObjectOutputStream(bos);
		oos.writeObject(this);// 当前这个对象以对象流的方式输出

		// 反序列化
		bis = new ByteArrayInputStream(bos.toByteArray());
		ois = new ObjectInputStream(bis);
		DeepPrototype coptObj = (DeepPrototype) ois.readObject();

		bos.close();
		oos.close();
		bis.close();
		ois.close();

		return coptObj;
	}
}
