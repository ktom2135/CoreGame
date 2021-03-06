package ru.o2genum.coregame.link;

import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.Point;
import android.graphics.PointF;
import ru.o2genum.coregame.link.Utility.LinkItemType;

public class LinkItem {

	private LinkItemType type = LinkItemType.T0;
	
	private Point index ;
	
	private Bitmap bitmap;
	
	public boolean isSelect = false;
	
	public LinkItem(LinkItemType type, Point index, Bitmap bitmap)
	{
		this.type = type;
		this.index = index;
		this.bitmap = bitmap;
	}
	
	public LinkItemType GetLinkItemType()
	{
		return type;
	}
	
	public Point GetIndex()
	{
		return this.index;
	}
	
	public Bitmap GetBitmap()
	{
		return bitmap;
	}
}
