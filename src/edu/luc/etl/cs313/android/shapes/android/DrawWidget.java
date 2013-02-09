package edu.luc.etl.cs313.android.shapes.android;

import edu.luc.etl.cs313.android.shapes.model.*;
import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.View;

public class DrawWidget extends View {

	public DrawWidget(final Context context, final AttributeSet attrs, final int defStyle) {
		this(context);
	}

	public DrawWidget(final Context context, final AttributeSet attrs) {
		this(context);
	}

	public DrawWidget(final Context context) { super(context); }

	@Override
	protected void onMeasure(final int widthMeasureSpec, final int heightMeasureSpec) {
		setMeasuredDimension(widthMeasureSpec, heightMeasureSpec);
	}

	@Override
	@SuppressLint("DrawAllocation")
	protected void onDraw(final Canvas canvas) {
		final Shape shape = Fixtures.complexGroup;
		final Location b = shape.accept(new BoundingBox());
		canvas.translate(-b.getX(), -b.getY());
		b.accept(new Draw(canvas));
		shape.accept(new Draw(canvas));
		canvas.translate(b.getX(), b.getY());
	}
}