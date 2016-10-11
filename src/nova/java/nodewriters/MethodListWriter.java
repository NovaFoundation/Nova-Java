package nova.java.nodewriters;

import net.fathomsoft.nova.tree.*;

public abstract class MethodListWriter extends TypeListWriter
{
	public abstract MethodList node();
	
	@Override
	public StringBuilder write(StringBuilder builder)
	{
		node().forEachChild(node -> {
			getWriter(node).write(builder).append('\n');
		});
		
		return builder;
	}
}