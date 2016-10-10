package nova.java.nodewriters;

import net.fathomsoft.nova.tree.*;

public abstract class LiteralWriter extends IValueWriter implements AccessibleWriter
{
	public abstract Literal node();
	
	
}