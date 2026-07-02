#include <iostream>
using namespace std;

class Node {
public:
    int data;
    Node* next;
    Node* prev;
    
};
class List {
private:
    Node* head = NULL;
    Node* temp = NULL;
public:
    void input() {
        int value;
        cout << "Enter value: ";
        cin >> value;
        Node* newnode = new Node();
        newnode->data = value;
        newnode->next = NULL;
        newnode->prev = NULL;
        if (head == NULL) { 
            head = newnode;
            temp = newnode;
            newnode->next = newnode;
            newnode->prev = newnode;
            return;
        }
        newnode->next = head;
        newnode->prev = temp;
        temp->next = newnode;
        head->prev = newnode;
        temp = newnode;
    }
    void insert_Start() {
        int value;
        cout << "Enter value: ";
        cin >> value;
        Node* newnode = new Node();
        newnode->data = value;
        newnode->next = NULL;
        newnode->prev = NULL;
        if (head == NULL) { 
            head = newnode;
            temp = newnode;
            newnode->next = newnode;
            newnode->prev = newnode;
            return;
        }
        newnode->next = head;
        newnode->prev = temp;
        temp->next = newnode;
        head->prev = newnode;
        head = newnode;
    }
    void insertion_Specific() {
        if (head == NULL) {
            cout << "List is empty. Inserting at start." << endl;
            insert_Start();
            return;
        }
        int pos, value;
        cout << "Enter position: ";
        cin >> pos;
        cout << "Enter value: ";
        cin >> value;
        if (pos == 1) {
            insert_Start();
            return;
        }
        Node* newnode = new Node();
        newnode->data = value;
        Node* temptr = head;
        int count = 1;
        while (count < pos - 1 && temptr->next != head) {
            temptr = temptr->next;
            count++;
        }
        if (temptr->next == head) {
            newnode->next = head;
            newnode->prev = temptr;
            temptr->next = newnode;
            head->prev = newnode;
            temp = newnode;
            return;
        }
        newnode->next = temptr->next;
        newnode->prev = temptr;
        temptr->next->prev = newnode;
        temptr->next = newnode;
    }
    void deletion_Start() {
        if (head == NULL) {
            cout << "List is empty!" << endl;
            return;
        }
        if (head->next == head) { 
            delete head;
            head = NULL;
            temp = NULL;
            return;
        }
        Node* delptr = head;
        head = head->next;
        head->prev = temp;
        temp->next = head;
        delete delptr;
    }
    void deletion_Last() {
        if (head == NULL) {
            cout << "List is empty!" << endl;
            return;
        }
        if (head->next == head) {
            delete head;
            head = NULL;
            temp = NULL;
            return;
        }
        Node* delptr = temp;
        temp = temp->prev;
        temp->next = head;
        head->prev = temp;
        delete delptr;
    }
    void Deletion_Specific() {
        if (head == NULL) {
            cout << "List is empty!" << endl;
            return;
        }
        int pos;
        cout << "Enter position: ";
        cin >> pos;
        if (pos == 1) {
            deletion_Start();
            return;
        }
        Node* temptr = head;
        int count = 1;

        while (count < pos - 1 && temptr->next != head) {
            temptr = temptr->next;
            count++;
        }
        if (temptr->next == head) {
            cout << "You entered wrong position!" << endl;
            return;
        }
        Node* delptr = temptr->next;
        temptr->next = delptr->next;
        delptr->next->prev = temptr;
        if (delptr == temp) {
            temp = temptr; 
        }
        delete delptr;
    }
    void Display() {
        if (head == NULL) {
            cout << "List is empty!" << endl;
            return;
        }
        Node* ptr = head;
        do {
            cout << ptr->data << "\t";
            ptr = ptr->next;
        } while (ptr != head);
        cout << endl;
    }
};

int main() {
    List L1;
    int choice;

    do {
        cout << "1. Insertion At Last" << endl;
        cout << "2. Insertion At Start" << endl;
        cout << "3. Insertion At Specific" << endl;
        cout << "4. Deletion At Start" << endl;
        cout << "5. Deletion At Last" << endl;
        cout << "6. Deletion At Specific" << endl;
        cout << "7. Display List" << endl;
        cout << "8. Exit" << endl;
        cout << "Enter your choice: ";
        cin >> choice;

        switch (choice) {
            case 1:
            	L1.input();
            	break;
            	case 2:
            		L1.insert_Start();
            		break;
            		case 3:
            			L1.insertion_Specific();
            			break;
            			case 4:
            				L1.deletion_Start();
            				break;
            				case 5:
            					L1.deletion_Last();
            					break;
            					case 6:
            						L1.Deletion_Specific();
            						break;
            						case 7:
            							L1.Display();
            							break;
            							case 8:
            								exit(0);
            								default:
            									cout<<"You entered wrong choice!"<<endl;
        }
    } while (true);

    return 0;
}

