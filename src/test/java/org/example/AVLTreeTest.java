package org.example;
import junit.framework.TestCase;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import java.util.ArrayList;
import java.util.List;

@ExtendWith(MockitoExtension.class)
public class AVLTreeTest extends TestCase {

    @Mock
    AVLTree Mocktree;

    @Test
    public void testTreeMocking() {
        List<AVLTree> TreeMockList = new ArrayList<AVLTree>();
        AVLTree MockTree1 = new AVLTree();
        int MockNum1 = 8;
        int MockNum2 = 24;
        int MockNum3 = 68;
        int MockNum4 = 1;
        int MockNum5 = 49;
        int MockNum6 = 30;
        int MockNum7 = 20;
        int MockNum8 = 17;

        MockTree1.root = MockTree1.insertNode(MockTree1.root, MockNum1);
        MockTree1.root = MockTree1.insertNode(MockTree1.root, MockNum2);
        MockTree1.root = MockTree1.insertNode(MockTree1.root, MockNum3);
        MockTree1.root = MockTree1.insertNode(MockTree1.root, MockNum4);
        MockTree1.root = MockTree1.insertNode(MockTree1.root, MockNum5);
        MockTree1.root = MockTree1.insertNode(MockTree1.root, MockNum6);
        MockTree1.root = MockTree1.insertNode(MockTree1.root, MockNum7);
        MockTree1.root = MockTree1.insertNode(MockTree1.root, MockNum8);
        MockTree1.printTree(MockTree1.root, "", true);
        TreeMockList.add(MockTree1);
    }
    @Test
    public void testTreeMocking2() {
        List<AVLTree> TreeMockList = new ArrayList<AVLTree>();
        AVLTree MockTree2 = new AVLTree();
        int MockNum1 = 60;
        int MockNum2 = 37;
        int MockNum3 = 17;
        int MockNum4 = 79;
        int MockNum5 = 54;
        int MockNum6 = 7;
        int MockNum7 = 5;
        int MockNum8 = 9;

        MockTree2.root = MockTree2.insertNode(MockTree2.root, MockNum1);
        MockTree2.root = MockTree2.insertNode(MockTree2.root, MockNum2);
        MockTree2.root = MockTree2.insertNode(MockTree2.root, MockNum3);
        MockTree2.root = MockTree2.insertNode(MockTree2.root, MockNum4);
        MockTree2.root = MockTree2.insertNode(MockTree2.root, MockNum5);
        MockTree2.root = MockTree2.insertNode(MockTree2.root, MockNum6);
        MockTree2.root = MockTree2.insertNode(MockTree2.root, MockNum7);
        MockTree2.root = MockTree2.insertNode(MockTree2.root, MockNum8);
        MockTree2.printTree(MockTree2.root, "", true);
        TreeMockList.add(MockTree2);
    }
    @Test
    public void testTreeMocking3() {
        List<AVLTree> TreeMockList = new ArrayList<AVLTree>();
        AVLTree MockTree3 = new AVLTree();
        int MockNum1 = 99;
        int MockNum2 = 24;
        int MockNum3 = 46;
        int MockNum4 = 6;
        int MockNum5 = 8;
        int MockNum6 = 24;
        int MockNum7 = 70;
        int MockNum8 = 10;

        MockTree3.root = MockTree3.insertNode(MockTree3.root, MockNum1);
        MockTree3.root = MockTree3.insertNode(MockTree3.root, MockNum2);
        MockTree3.root = MockTree3.insertNode(MockTree3.root, MockNum3);
        MockTree3.root = MockTree3.insertNode(MockTree3.root, MockNum4);
        MockTree3.root = MockTree3.insertNode(MockTree3.root, MockNum5);
        MockTree3.root = MockTree3.insertNode(MockTree3.root, MockNum6);
        MockTree3.root = MockTree3.insertNode(MockTree3.root, MockNum7);
        MockTree3.root = MockTree3.insertNode(MockTree3.root, MockNum8);
        MockTree3.printTree(MockTree3.root, "", true);
        TreeMockList.add(MockTree3);
    }
}